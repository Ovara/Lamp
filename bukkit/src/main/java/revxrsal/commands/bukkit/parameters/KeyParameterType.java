package revxrsal.commands.bukkit.parameters;

import net.kyori.adventure.key.Key;
import org.jetbrains.annotations.NotNull;
import revxrsal.commands.bukkit.actor.BukkitCommandActor;
import revxrsal.commands.node.ExecutionContext;
import revxrsal.commands.parameter.ParameterType;
import revxrsal.commands.stream.MutableStringStream;

public class KeyParameterType implements ParameterType<BukkitCommandActor, Key> {

    @SuppressWarnings("PatternValidation")
    @Override
    public Key parse(@NotNull MutableStringStream input, @NotNull ExecutionContext<@NotNull BukkitCommandActor> context) {
        return Key.key(input.readUnquotedString());
    }
}
