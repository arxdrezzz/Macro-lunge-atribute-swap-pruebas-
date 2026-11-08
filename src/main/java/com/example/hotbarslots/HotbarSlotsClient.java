package com.example.hotbarslots;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class HotbarSlotsClient implements ClientModInitializer {

    private static KeyBinding slot9Key;
    private static KeyBinding slot6Key;

    @Override
    public void onInitializeClient() {

        slot9Key = KeyBindingHelper.registerKeyBinding(
            new KeyBinding(
                "key.hotbarslots.slot9",
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_N,
                KeyBinding.Category.MISC
            )
        );

        slot6Key = KeyBindingHelper.registerKeyBinding(
            new KeyBinding(
                "key.hotbarslots.slot6",
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_M,
                KeyBinding.Category.MISC
            )
        );

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (client.player == null) return;

            while (slot9Key.wasPressed()) {
                client.player.getInventory().setSelectedSlot(8);
            }

            while (slot6Key.wasPressed()) {
                client.player.getInventory().setSelectedSlot(5);
            }
        });
    }
}
