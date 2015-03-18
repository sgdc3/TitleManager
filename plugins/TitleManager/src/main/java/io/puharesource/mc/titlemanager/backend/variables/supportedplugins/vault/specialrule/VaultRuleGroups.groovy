package io.puharesource.mc.titlemanager.backend.variables.supportedplugins.vault.specialrule

import io.puharesource.mc.titlemanager.TitleManager
import io.puharesource.mc.titlemanager.backend.variables.VariableRule
import org.bukkit.entity.Player

class VaultRuleGroups extends VariableRule {
    @Override
    boolean rule(Player player) { TitleManager.isPermissionsSupported() && TitleManager.getPermissions().hasGroupSupport() }

    @Override
    String[] replace(Player player, String text) {
        return new String[0]
    }
}
