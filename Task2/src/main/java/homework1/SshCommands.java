package homework1;

import java.io.InputStream;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

/**
 * Class with an example command using the Jsch framework to send a command via SSH.
 * 
 * @author Fedor Smirnov
 *
 */
public class SshCommands {

	public static final String EXIT_STRING = "STOP_SSH_CONNECTION";
	
	/**
	 * Command to send a command to a specified instance using SSH. Tries to execure
	 * the command up to 10 times.
	 * 
	 * @param instanceIp       the ip of the instance
	 * @param pathToKeyPairPem the path to the authentification key
	 * @param command          the command to execute
	 * @return the output of the command
	 */
	public static String sendCommandViaSsh(String instanceIp, String pathToKeyPairPem, String command) {
		for (int k = 0; k < 10; k++) {
			String res = "";
			try {
				JSch jsch = new JSch();
				JSch.setConfig("StrictHostKeyChecking", "no");
				jsch.addIdentity(pathToKeyPairPem);

				Session session = jsch.getSession("ec2-user", instanceIp, 22);
				session.connect();

				// run stuff
				Channel channel = session.openChannel("exec");
				((ChannelExec) channel).setCommand(command);
				((ChannelExec) channel).setErrStream(System.err);
				channel.connect();

				InputStream input = channel.getInputStream();
				// start reading the input from the executed commands on the shell
				byte[] tmp = new byte[1024];
				outer: while (true) {
					while (input.available() > 0) {
						int i = input.read(tmp, 0, 1024);
						if (i < 0)
							break;
						String outputLine = new String(tmp, 0, i);
						if (outputLine.contains(EXIT_STRING)) {
							System.out.println("exit command now! ");
							break outer;
						}
						res += outputLine;
						System.out.println("\t\t" + outputLine);
					}
					if (channel.isClosed()) {
						System.out.println("exit-status: " + channel.getExitStatus());
						break;
					}
					Thread.sleep(1000);
				}
				channel.disconnect();
				session.disconnect();
				return res;
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("ERROR Retry sending command " + (k + 1) + "/10");
		}
		return null;
	}
	
}
