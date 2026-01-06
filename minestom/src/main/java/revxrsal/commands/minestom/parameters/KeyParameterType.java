package revxrsal.commands.minestom.parameters;

import net.kyori.adventure.key.Key;
import org.jetbrains.annotations.NotNull;
import revxrsal.commands.minestom.actor.MinestomCommandActor;
import revxrsal.commands.node.ExecutionContext;
import revxrsal.commands.parameter.ParameterType;
import revxrsal.commands.stream.MutableStringStream;

public class KeyParameterType implements ParameterType<MinestomCommandActor, Key> {

    @SuppressWarnings("PatternValidation")
    @Override
    public Key parse(@NotNull MutableStringStream input, @NotNull ExecutionContext<@NotNull MinestomCommandActor> context) {
        return Key.key(input.readUnquotedString());
    }
}
