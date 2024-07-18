package fi.dy.masa.tweakeroo.config;

import java.util.List;
import com.google.common.collect.ImmutableList;
import fi.dy.masa.malilib.config.options.ConfigHotkey;
import fi.dy.masa.malilib.hotkeys.KeyAction;
import fi.dy.masa.malilib.hotkeys.KeybindSettings;
import fi.dy.masa.malilib.hotkeys.KeybindSettings.Context;

public class Hotkeys
{
    public static final ConfigHotkey ACCURATE_BLOCK_PLACEMENT_IN        = new ConfigHotkey("accurateBlockPlacementInto",        "",     KeybindSettings.PRESS_ALLOWEXTRA, "tweakeroo.config.hotkey.comment.accurateBlockPlacementInto").translatedName("tweakeroo.config.hotkey.name.accurateBlockPlacementInto");
    public static final ConfigHotkey ACCURATE_BLOCK_PLACEMENT_REVERSE   = new ConfigHotkey("accurateBlockPlacementReverse",     "",     KeybindSettings.PRESS_ALLOWEXTRA, "tweakeroo.config.hotkey.comment.accurateBlockPlacementReverse").translatedName("tweakeroo.config.hotkey.name.accurateBlockPlacementReverse");
    public static final ConfigHotkey BREAKING_RESTRICTION_MODE_COLUMN   = new ConfigHotkey("breakingRestrictionModeColumn",     "",     "tweakeroo.config.hotkey.comment.breakingRestrictionModeColumn").translatedName("tweakeroo.config.hotkey.name.breakingRestrictionModeColumn");
    public static final ConfigHotkey BREAKING_RESTRICTION_MODE_DIAGONAL = new ConfigHotkey("breakingRestrictionModeDiagonal",   "",     "tweakeroo.config.hotkey.comment.breakingRestrictionModeDiagonal").translatedName("tweakeroo.config.hotkey.name.breakingRestrictionModeDiagonal");
    public static final ConfigHotkey BREAKING_RESTRICTION_MODE_FACE     = new ConfigHotkey("breakingRestrictionModeFace",       "",     "tweakeroo.config.hotkey.comment.breakingRestrictionModeFace").translatedName("tweakeroo.config.hotkey.name.breakingRestrictionModeFace");
    public static final ConfigHotkey BREAKING_RESTRICTION_MODE_LAYER    = new ConfigHotkey("breakingRestrictionModeLayer",      "",     "tweakeroo.config.hotkey.comment.breakingRestrictionModeLayer").translatedName("tweakeroo.config.hotkey.name.breakingRestrictionModeLayer");
    public static final ConfigHotkey BREAKING_RESTRICTION_MODE_LINE     = new ConfigHotkey("breakingRestrictionModeLine",       "",     "tweakeroo.config.hotkey.comment.breakingRestrictionModeLine").translatedName("tweakeroo.config.hotkey.name.breakingRestrictionModeLine");
    public static final ConfigHotkey BREAKING_RESTRICTION_MODE_PLANE    = new ConfigHotkey("breakingRestrictionModePlane",      "",     "tweakeroo.config.hotkey.comment.breakingRestrictionModePlane").translatedName("tweakeroo.config.hotkey.name.breakingRestrictionModePlane");
    public static final ConfigHotkey COPY_SIGN_TEXT                     = new ConfigHotkey("copySignText",                      "",     "tweakeroo.config.hotkey.comment.copySignText").translatedName("tweakeroo.config.hotkey.name.copySignText");
    public static final ConfigHotkey ELYTRA_CAMERA                      = new ConfigHotkey("elytraCamera",                      "",     "tweakeroo.config.hotkey.comment.elytraCamera").translatedName("tweakeroo.config.hotkey.name.elytraCamera");
    public static final ConfigHotkey FLEXIBLE_BLOCK_PLACEMENT_ADJACENT  = new ConfigHotkey("flexibleBlockPlacementAdjacent",    "",     KeybindSettings.PRESS_ALLOWEXTRA, "tweakeroo.config.hotkey.comment.flexibleBlockPlacementAdjacent").translatedName("tweakeroo.config.hotkey.name.flexibleBlockPlacementAdjacent");
    public static final ConfigHotkey FLEXIBLE_BLOCK_PLACEMENT_OFFSET    = new ConfigHotkey("flexibleBlockPlacementOffset",      "LEFT_CONTROL", KeybindSettings.PRESS_ALLOWEXTRA, "tweakeroo.config.hotkey.comment.flexibleBlockPlacementOffset").translatedName("tweakeroo.config.hotkey.name.flexibleBlockPlacementOffset");
    public static final ConfigHotkey FLEXIBLE_BLOCK_PLACEMENT_ROTATION  = new ConfigHotkey("flexibleBlockPlacementRotation",    "LEFT_ALT", KeybindSettings.PRESS_ALLOWEXTRA, "tweakeroo.config.hotkey.comment.flexibleBlockPlacementRotation").translatedName("tweakeroo.config.hotkey.name.flexibleBlockPlacementRotation");
    public static final ConfigHotkey FLY_PRESET_1                       = new ConfigHotkey("flyPreset1",                        "",     "tweakeroo.config.hotkey.comment.flyPreset1").translatedName("tweakeroo.config.hotkey.name.flyPreset1");
    public static final ConfigHotkey FLY_PRESET_2                       = new ConfigHotkey("flyPreset2",                        "",     "tweakeroo.config.hotkey.comment.flyPreset2").translatedName("tweakeroo.config.hotkey.name.flyPreset2");
    public static final ConfigHotkey FLY_PRESET_3                       = new ConfigHotkey("flyPreset3",                        "",     "tweakeroo.config.hotkey.comment.flyPreset3").translatedName("tweakeroo.config.hotkey.name.flyPreset3");
    public static final ConfigHotkey FLY_PRESET_4                       = new ConfigHotkey("flyPreset4",                        "",     "tweakeroo.config.hotkey.comment.flyPreset4").translatedName("tweakeroo.config.hotkey.name.flyPreset4");
    public static final ConfigHotkey FREE_CAMERA_PLAYER_INPUTS          = new ConfigHotkey("freeCameraPlayerInputs",            "",     "tweakeroo.config.hotkey.comment.freeCameraPlayerInputs").translatedName("tweakeroo.config.hotkey.name.freeCameraPlayerInputs");
    public static final ConfigHotkey FREE_CAMERA_PLAYER_MOVEMENT        = new ConfigHotkey("freeCameraPlayerMovement",          "",     "tweakeroo.config.hotkey.comment.freeCameraPlayerMovement").translatedName("tweakeroo.config.hotkey.name.freeCameraPlayerMovement");
    public static final ConfigHotkey HOTBAR_SCROLL                      = new ConfigHotkey("hotbarScroll",                      "",     KeybindSettings.RELEASE_ALLOW_EXTRA, "tweakeroo.config.hotkey.comment.hotbarScroll").translatedName("tweakeroo.config.hotkey.name.hotbarScroll");
    public static final ConfigHotkey HOTBAR_SWAP_BASE                   = new ConfigHotkey("hotbarSwapBase",                    "",     KeybindSettings.PRESS_ALLOWEXTRA, "tweakeroo.config.hotkey.comment.hotbarSwapBase").translatedName("tweakeroo.config.hotkey.name.hotbarSwapBase");
    public static final ConfigHotkey HOTBAR_SWAP_1                      = new ConfigHotkey("hotbarSwap1",                       "",     "tweakeroo.config.hotkey.comment.hotbarSwap1").translatedName("tweakeroo.config.hotkey.name.hotbarSwap1");
    public static final ConfigHotkey HOTBAR_SWAP_2                      = new ConfigHotkey("hotbarSwap2",                       "",     "tweakeroo.config.hotkey.comment.hotbarSwap2").translatedName("tweakeroo.config.hotkey.name.hotbarSwap2");
    public static final ConfigHotkey HOTBAR_SWAP_3                      = new ConfigHotkey("hotbarSwap3",                       "",     "tweakeroo.config.hotkey.comment.hotbarSwap3").translatedName("tweakeroo.config.hotkey.name.hotbarSwap3");
    public static final ConfigHotkey INVENTORY_PREVIEW                  = new ConfigHotkey("inventoryPreview",                  "LEFT_ALT", KeybindSettings.PRESS_ALLOWEXTRA, "tweakeroo.config.hotkey.comment.inventoryPreview").translatedName("tweakeroo.config.hotkey.name.inventoryPreview");
    public static final ConfigHotkey OPEN_CONFIG_GUI                    = new ConfigHotkey("openConfigGui",                     "X,C",  "tweakeroo.config.hotkey.comment.openConfigGui").translatedName("tweakeroo.config.hotkey.name.openConfigGui");
    public static final ConfigHotkey PLACEMENT_Y_MIRROR                 = new ConfigHotkey("placementYMirror",                  "",     KeybindSettings.PRESS_ALLOWEXTRA, "tweakeroo.config.hotkey.comment.placementYMirror").translatedName("tweakeroo.config.hotkey.name.placementYMirror");
    public static final ConfigHotkey PLAYER_INVENTORY_PEEK              = new ConfigHotkey("playerInventoryPeek",               "",     KeybindSettings.PRESS_ALLOWEXTRA, "tweakeroo.config.hotkey.comment.playerInventoryPeek").translatedName("tweakeroo.config.hotkey.name.playerInventoryPeek");
    public static final ConfigHotkey PLACEMENT_RESTRICTION_MODE_COLUMN  = new ConfigHotkey("placementRestrictionModeColumn",    "Z,3",  "tweakeroo.config.hotkey.comment.placementRestrictionModeColumn").translatedName("tweakeroo.config.hotkey.name.placementRestrictionModeColumn");
    public static final ConfigHotkey PLACEMENT_RESTRICTION_MODE_DIAGONAL= new ConfigHotkey("placementRestrictionModeDiagonal",  "Z,5",  "tweakeroo.config.hotkey.comment.placementRestrictionModeDiagonal").translatedName("tweakeroo.config.hotkey.name.placementRestrictionModeDiagonal");
    public static final ConfigHotkey PLACEMENT_RESTRICTION_MODE_FACE    = new ConfigHotkey("placementRestrictionModeFace",      "Z,2",  "tweakeroo.config.hotkey.comment.placementRestrictionModeFace").translatedName("tweakeroo.config.hotkey.name.placementRestrictionModeFace");
    public static final ConfigHotkey PLACEMENT_RESTRICTION_MODE_LAYER   = new ConfigHotkey("placementRestrictionModeLayer",     "Z,6",  "tweakeroo.config.hotkey.comment.placementRestrictionModeLayer").translatedName("tweakeroo.config.hotkey.name.placementRestrictionModeLayer");
    public static final ConfigHotkey PLACEMENT_RESTRICTION_MODE_LINE    = new ConfigHotkey("placementRestrictionModeLine",      "Z,4",  "tweakeroo.config.hotkey.comment.placementRestrictionModeLine").translatedName("tweakeroo.config.hotkey.name.placementRestrictionModeLine");
    public static final ConfigHotkey PLACEMENT_RESTRICTION_MODE_PLANE   = new ConfigHotkey("placementRestrictionModePlane",     "Z,1",  "tweakeroo.config.hotkey.comment.placementRestrictionModePlane").translatedName("tweakeroo.config.hotkey.name.placementRestrictionModePlane");
    public static final ConfigHotkey SIT_DOWN_NEARBY_PETS               = new ConfigHotkey("sitDownNearbyPets",                 "",     "tweakeroo.config.hotkey.comment.sitDownNearbyPets").translatedName("tweakeroo.config.hotkey.name.sitDownNearbyPets");
    public static final ConfigHotkey SKIP_ALL_RENDERING                 = new ConfigHotkey("skipAllRendering",                  "",     "tweakeroo.config.hotkey.comment.skipAllRendering").translatedName("tweakeroo.config.hotkey.name.skipAllRendering");
    public static final ConfigHotkey SKIP_WORLD_RENDERING               = new ConfigHotkey("skipWorldRendering",                "",     "tweakeroo.config.hotkey.comment.skipWorldRendering").translatedName("tweakeroo.config.hotkey.name.skipWorldRendering");
    public static final ConfigHotkey STAND_UP_NEARBY_PETS               = new ConfigHotkey("standUpNearbyPets",                 "",     "tweakeroo.config.hotkey.comment.standUpNearbyPets").translatedName("tweakeroo.config.hotkey.name.standUpNearbyPets");
    public static final ConfigHotkey SWAP_ELYTRA_CHESTPLATE             = new ConfigHotkey("swapElytraChestplate",              "",     "tweakeroo.config.hotkey.comment.swapElytraChestplate").translatedName("tweakeroo.config.hotkey.name.swapElytraChestplate");
    public static final ConfigHotkey TOGGLE_AP_PROTOCOL                 = new ConfigHotkey("toggleAccuratePlacementProtocol",   "",     "tweakeroo.config.hotkey.comment.toggleAccuratePlacementProtocol").translatedName("tweakeroo.config.hotkey.name.toggleAccuratePlacementProtocol");
    public static final ConfigHotkey TOGGLE_GRAB_CURSOR                 = new ConfigHotkey("toggleGrabCursor",                  "",     "tweakeroo.config.hotkey.comment.toggleGrabCursor").translatedName("tweakeroo.config.hotkey.name.toggleGrabCursor");
    public static final ConfigHotkey TOOL_PICK                          = new ConfigHotkey("toolPick",                          "",     "tweakeroo.config.hotkey.comment.toolPick").translatedName("tweakeroo.config.hotkey.name.toolPick");
    public static final ConfigHotkey WRITE_MAPS_AS_IMAGES               = new ConfigHotkey("writeMapsAsImages",                 "",     "tweakeroo.config.hotkey.comment.writeMapsAsImages").translatedName("tweakeroo.config.hotkey.name.writeMapsAsImages");
    public static final ConfigHotkey ZOOM_ACTIVATE                      = new ConfigHotkey("zoomActivate",                      "",     KeybindSettings.create(Context.INGAME, KeyAction.BOTH, true, false, false, false, false), "tweakeroo.config.hotkey.comment.zoomActivate").translatedName("tweakeroo.config.hotkey.name.zoomActivate");

    public static final List<ConfigHotkey> HOTKEY_LIST = ImmutableList.of(
            ACCURATE_BLOCK_PLACEMENT_IN,
            ACCURATE_BLOCK_PLACEMENT_REVERSE,
            BREAKING_RESTRICTION_MODE_COLUMN,
            BREAKING_RESTRICTION_MODE_DIAGONAL,
            BREAKING_RESTRICTION_MODE_FACE,
            BREAKING_RESTRICTION_MODE_LAYER,
            BREAKING_RESTRICTION_MODE_LINE,
            BREAKING_RESTRICTION_MODE_PLANE,
            COPY_SIGN_TEXT,
            ELYTRA_CAMERA,
            FLEXIBLE_BLOCK_PLACEMENT_ADJACENT,
            FLEXIBLE_BLOCK_PLACEMENT_OFFSET,
            FLEXIBLE_BLOCK_PLACEMENT_ROTATION,
            FLY_PRESET_1,
            FLY_PRESET_2,
            FLY_PRESET_3,
            FLY_PRESET_4,
            FREE_CAMERA_PLAYER_INPUTS,
            FREE_CAMERA_PLAYER_MOVEMENT,
            HOTBAR_SCROLL,
            HOTBAR_SWAP_BASE,
            HOTBAR_SWAP_1,
            HOTBAR_SWAP_2,
            HOTBAR_SWAP_3,
            INVENTORY_PREVIEW,
            OPEN_CONFIG_GUI,
            PLACEMENT_Y_MIRROR,
            PLAYER_INVENTORY_PEEK,
            PLACEMENT_RESTRICTION_MODE_COLUMN,
            PLACEMENT_RESTRICTION_MODE_DIAGONAL,
            PLACEMENT_RESTRICTION_MODE_FACE,
            PLACEMENT_RESTRICTION_MODE_LAYER,
            PLACEMENT_RESTRICTION_MODE_LINE,
            PLACEMENT_RESTRICTION_MODE_PLANE,
            SIT_DOWN_NEARBY_PETS,
            SKIP_ALL_RENDERING,
            SKIP_WORLD_RENDERING,
            STAND_UP_NEARBY_PETS,
            SWAP_ELYTRA_CHESTPLATE,
            TOGGLE_AP_PROTOCOL,
            TOGGLE_GRAB_CURSOR,
            TOOL_PICK,
            WRITE_MAPS_AS_IMAGES,
            ZOOM_ACTIVATE
    );
}
