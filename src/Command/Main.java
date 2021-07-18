package Command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	@Override
	public void onEnable() {
		System.out.println("플러그인이 활성화 되었습니다");
	}
	
	@Override
	public void onDisable() {
		System.out.println("플러그인이 비활성화 되었습니다.");
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("test")) {
			if(sender instanceof Player) {
				sender.sendMessage("플러그인 작동");
				return false;
			}
			sender.sendMessage("플레이어만 쓸수 있습니다");
			return false;
		}
		if(cmd.getName().equalsIgnoreCase("kick")) {
			Player p = (Player) sender;
			p.kickPlayer("넌 서버장이 아니잖아 이자식아");
			return false;
		}
		
		return true;
	}
}
