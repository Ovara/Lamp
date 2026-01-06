package revxrsal.commands.fabric.parameters;

import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;
import revxrsal.commands.fabric.actor.FabricCommandActor;
import revxrsal.commands.node.ExecutionContext;
import revxrsal.commands.parameter.ParameterType;
import revxrsal.commands.stream.MutableStringStream;

public class IdentifierParameterType implements ParameterType<FabricCommandActor, Identifier> {

    @SuppressWarnings("PatternValidation")
    @Override
    public Identifier parse(@NotNull MutableStringStream input, @NotNull ExecutionContext<@NotNull FabricCommandActor> context) {
        return Identifier.of(input.readUnquotedString());
    }
}
