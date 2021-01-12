package ink.maxelbk.ui;

import javax.swing.plaf.ColorUIResource;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class ResourcesManager {
    private static final Map<String, Object> global = new HashMap<>();

    public static void putColor(String key, Color color) {

    }
    public static ColorUIResource getColor(String key) {
    	return (ColorUIResource) global.get("colors." + key);
	}
    public static Object[] getColors() {
        return new Object[] {
                "desktop", 					global.get("colors.desktop"),
                /* Color of the desktop background */
                "activeCaption", 			global.get("colors.activeCaption"),
                /* Color for captions (title bars) when they are active. */
                "activeCaptionText", 		global.get("colors.activeCaptionText"),
                /* Text color for text in captions (title bars). */
                "activeCaptionBorder", 		global.get("colors.activeCaptionBorder"),
                /* Border color for caption (title bar) window borders. */
                "inactiveCaption", 			global.get("colors.inactiveCaption"),
                /* Color for captions (title bars) when not active. */
                "inactiveCaptionText", 		global.get("colors.inactiveCaptionText"),
                /* Text color for text in inactive captions (title bars). */
                "inactiveCaptionBorder", 	global.get("colors.inactiveCaptionBorder"),
                /* Border color for inactive caption (title bar) window borders. */
                "window", 					global.get("colors.window"),
                /* Default color for the interior of windows */
                "windowBorder", 			global.get("colors.windowBorder"),
                /* ??? */
                "windowText", 				global.get("colors.windowText"),
                /* ??? */
                "menu", 					global.get("colors.menu"),
                /* Background color for menus */
                "menuText", 				global.get("colors.menuText"),
                /* Text color for menus  */
                "text", 					global.get("colors.text"),
                /* Text background color */
                "textText", 				global.get("colors.textText"),
                /* Text foreground color */
                "textHighlight", 			global.get("colors.textHighlight"),
                /* Text background color when selected */
                "textHighlightText", 		global.get("colors.textHighlightText"),
                /* Text color when selected */
                "textInactiveText", 		global.get("colors.textInactiveText"),
                /* Text color when disabled */
                "control", 					global.get("colors.control"),
                /* Default color for controls (buttons, sliders, etc) */
                "controlText", 				global.get("colors.controlText"),
                /* Default color for text in controls */
                "controlHighlight", 		global.get("colors.controlHighlight"),
                /* Specular highlight (opposite of the shadow) */
                "controlLtHighlight", 		global.get("colors.controlLtHighlight"),
                /* Highlight color for controls */
                "controlShadow", 			global.get("colors.controlShadow"),
                /* Shadow color for controls */
                "controlDkShadow", 			global.get("colors.controlDkShadow"),
                /* Dark shadow color for controls */
                "scrollbar", 				global.get("colors.scrollbar"),
                /* Scrollbar background (usually the "track") */
                "info", 					global.get("colors.info"),
                /* ??? */
                "infoText", 				global.get("colors.infoText"),
                /* ??? */
        };
    }
}
