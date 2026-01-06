package revxrsal.commands.sponge.parameters;

import net.kyori.adventure.key.Key;
import org.jetbrains.annotations.NotNull;
import revxrsal.commands.node.ExecutionContext;
import revxrsal.commands.parameter.ParameterType;
import revxrsal.commands.sponge.actor.SpongeCommandActor;
import revxrsal.commands.stream.MutableStringStream;

public class KeyParameterType implements ParameterType<SpongeCommandActor, Key> {

    @SuppressWarnings("PatternValidation")
    @Override
    public Key parse(@NotNull MutableStringStream input, @NotNull ExecutionContext<@NotNull SpongeCommandActor> context) {
        return Key.key(input.readUnquotedString());
    }
}
