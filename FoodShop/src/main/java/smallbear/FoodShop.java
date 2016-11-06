package smallbear;

import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.event.Listener;
import cn.nukkit.item.Item;
import cn.nukkit.plugin.PluginBase;
import me.onebone.economyapi.EconomyAPI;

public class FoodShop extends PluginBase implements Listener  {
	
	@Override
	public void onLoad() {
		this.getLogger().info("§a간편음식판매 플러그인 로딩중!");
	}
	public void onEnable() {
		this.getLogger().info("§a간편음식판매 플러그인 로딩완료!");
	}
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		String cmd = command.getName();
		Player player = this.getServer().getPlayer(sender.getName());
		
			if(cmd.equals("치킨구매")){
				if(args.length < 1){
					sender.sendMessage("[빠른구매]치킨를 구매하셨습니다.(4개)(600원)");
					player.getInventory().addItem(new Item(366,0,4));
					EconomyAPI.getInstance().reduceMoney(player, 100);
			}
		}
			if(cmd.equals("사과구매")){
				if(args.length < 1){
					sender.sendMessage("[빠른구매]사과를 구매하셨습니다.(6개)(600원)");
					player.getInventory().addItem(new Item(260,0,6));
					EconomyAPI.getInstance().reduceMoney(player, 100);
			}
		}
			if(cmd.equals("빵구매")){
				if(args.length < 1){
					sender.sendMessage("[빠른구매]빵를 구매하셨습니다.(4개)(600원)");
					player.getInventory().addItem(new Item(297,0,4));
					EconomyAPI.getInstance().reduceMoney(player, 100);
			}
		}
			if(cmd.equals("구은감자구매")){
				if(args.length < 1){
					sender.sendMessage("[빠른구매]구운감자를 구매하셨습니다.(4개)(600원)");
					player.getInventory().addItem(new Item(393,0,4));
					EconomyAPI.getInstance().reduceMoney(player, 100);
			}
		}
			if(cmd.equals("케이크구매")){
				if(args.length < 1){
					sender.sendMessage("[빠른구매]케이크를 구매하셨습니다.(2개)(600원)");
					player.getInventory().addItem(new Item(354,0,2));
					EconomyAPI.getInstance().reduceMoney(player, 100);
			}
		}
		return true;
	}
}