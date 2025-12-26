package io.github.akademiwengdev.craftcord.neoforge;

import net.neoforged.fml.common.Mod;

import io.github.akademiwengdev.craftcord.ExampleMod;

@Mod(ExampleMod.MOD_ID)
public final class ExampleModNeoForge {
    public ExampleModNeoForge() {
        // Run our common setup.
        ExampleMod.init();
    }
}
