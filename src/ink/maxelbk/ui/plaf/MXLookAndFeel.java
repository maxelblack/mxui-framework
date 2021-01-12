package ink.maxelbk.ui.plaf;

import ink.maxelbk.ui.ResourcesManager;

import javax.swing.*;
import javax.swing.plaf.basic.BasicLookAndFeel;

public class MXLookAndFeel extends BasicLookAndFeel {
    //LookAndFeel信息
    @Override public String getName() {
        return "MX";
    }
    @Override public String getID() {
        return "MX";
    }
    @Override public String getDescription() {
        return "A modern GUI framework based on Java(tm) Swing";
    }
    @Override public boolean isNativeLookAndFeel() {
        return false;
    }
    @Override public boolean isSupportedLookAndFeel() {
        return true;
    }

    //组件UI类路径
    protected void initClassDefaults(UIDefaults table) {
        super.initClassDefaults(table);
        final String packageName = "ink.maxelbk.ui.plaf.";

        Object[] uiDefaults = {
                "ButtonUI", packageName + "MXButtonUI",
                "CheckBoxUI", packageName + "MXCheckBoxUI",
                "ComboBoxUI", packageName + "MXComboBoxUI",
                "DesktopIconUI", packageName + "MXDesktopIconUI",
                "FileChooserUI", packageName + "MXFileChooserUI",
                "InternalFrameUI", packageName + "MXInternalFrameUI",
                "LabelUI", packageName + "MXLabelUI",
                "PopupMenuSeparatorUI", packageName + "MXPopupMenuSeparatorUI",
                "ProgressBarUI", packageName + "MXProgressBarUI",
                "RadioButtonUI", packageName + "MXRadioButtonUI",
                "ScrollBarUI", packageName + "MXScrollBarUI",
                "ScrollPaneUI", packageName + "MXScrollPaneUI",
                "SeparatorUI", packageName + "MXSeparatorUI",
                "SliderUI", packageName + "MXSliderUI",
                "SplitPaneUI", packageName + "MXSplitPaneUI",
                "TabbedPaneUI", packageName + "MXTabbedPaneUI",
                "TextFieldUI", packageName + "MXTextFieldUI",
                "ToggleButtonUI", packageName + "MXToggleButtonUI",
                "ToolBarUI", packageName + "MXToolBarUI",
                "ToolTipUI", packageName + "MXToolTipUI",
                "TreeUI", packageName + "MXTreeUI",
                "OptionPaneUI", packageName + "MXOptionPaneUI",
                "PanelUI", packageName + "MXPanelUI",
                "RootPaneUI", packageName + "MXRootPaneUI",
        };

        table.putDefaults(uiDefaults);
    }

    protected void initSystemColorDefaults(UIDefaults table) {
        table.putDefaults(ResourcesManager.getColors());
    }
}
