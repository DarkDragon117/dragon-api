package dev.chechu.dragonapi.core.utils;

import dev.chechu.dragonapi.core.commands.Command;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
public class Description {
    @Getter private String command;
    @Getter private String description;
    @Getter private List<String> params;
    @Getter private List<Command> subcommands;
}
