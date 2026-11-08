package com.example.hotbarslots;

import com.mojang.blaze3d.platform.InputConstants;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.util.Identifier;
import org.lwjgl.glfw.GLFW;

public class HotbarSlotsClient implements ClientModInitializer {
    private static KeyBinding.Category CATEGORY;

    private static KeyBinding slot9Key;
    private static KeyBinding slot6Key;

    @Override
    public void onInitializeClient() {
        CATEGORY = KeyBinding.Category.create(Identifier.of("hotbarslots", "main"));

        slot9Key = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.hotbarslots.slot9",
                InputConstants.Type.KEYSYM,
                GLFW.GLFW_KEY_N,
                CATEGORY
        ));

        slot6Key = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.hotbarslots.slot6",
                InputConstants.Type.KEYSYM,
                GLFW.GLFW_KEY_M,
                CATEGORY
        ));

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (client.player == null) {
                return;
            }

            while (slot9Key.wasPressed()) {
                client.player.getInventory().selectedSlot = 8;
            }

            while (slot6Key.wasPressed()) {
                client.player.getInventory().selectedSlot = 5;
            }
        });
    }
}
