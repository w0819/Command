package Command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	@Override
	public void onEnable() {
		System.out.println("�÷������� Ȱ��ȭ �Ǿ����ϴ�");
	}
	
	@Override
	public void onDisable() {
		System.out.println("�÷������� ��Ȱ��ȭ �Ǿ����ϴ�.");
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("test")) {
			if(sender instanceof Player) {
				sender.sendMessage("�÷����� �۵�");
				return false;
			}
			sender.sendMessage("�÷��̾ ���� �ֽ��ϴ�");
			return false;
		}
		if(cmd.getName().equalsIgnoreCase("kick")) {
			Player p = (Player) sender;
			p.kickPlayer("�� �������� �ƴ��ݾ� ���ڽľ�");
			return false;
		}
		
		return true;
	}
}
