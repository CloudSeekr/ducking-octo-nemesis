package com.jij.justiciar;

import com.jij.framework.Screen;
import com.jij.framework.implementation.AndroidGame;

public class JusticiarActivity extends AndroidGame {
	@Override
	public void onBackPressed() {
	getCurrentScreen().backButton();
	}
	
    @Override
    public Screen getInitScreen() {
        return new LoadingScreen(this); 
    }
    
}