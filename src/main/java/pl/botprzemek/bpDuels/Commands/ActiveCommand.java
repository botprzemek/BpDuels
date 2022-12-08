package pl.botprzemek.bpDuels.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import pl.botprzemek.bpDuels.Game.GameManager;
import pl.botprzemek.bpDuels.Game.GameState;

public class ActiveCommand implements CommandExecutor {

    private GameManager gameManager;

    public ActiveCommand(GameManager gameManager) {

        this.gameManager = gameManager;

    }

    public boolean onCommand(CommandSender sender, Command command, String string, String[] args) {

        gameManager.setGameState(GameState.ACTIVE);

        return true;

    }
}
