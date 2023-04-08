package plugin.sample;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GetLevelCommand implements CommandExecutor {

  @Override
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
    if(sender instanceof Player player){
      int a;
      a = player.getLevel();
      player.sendMessage("現在のレベルは" + a + "です");
    }
    return false;
  }
}
