package com.libgdx.input;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.libgdx.input.Input_Data;

public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setForegroundFPS(60);
		config.setTitle("Entrada de Dados");
		config.setWindowedMode(500,400);
		config.setResizable(false);
		new Lwjgl3Application(new Input_Data(), config);
	}
}
