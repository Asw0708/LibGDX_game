package com.space_shooter.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class Main extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	int clk;


	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("neon.jpg");

	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 1, 0, 1);

// движение картинки за мышкой или пальцем
		float x = Gdx.input.getX() - img.getWidth()/2;
		float y = Gdx.graphics.getHeight() - Gdx.input.getY() - img.getWidth()/2;

		// перехват нажатия кнопок мыши

		if (Gdx.input.isButtonJustPressed(Input.Buttons.LEFT)) clk++;
		Gdx.graphics.setTitle("Clicked " + clk + " times!");



		batch.begin();
		batch.draw(img, 0,0);
		batch.draw(img, x, y);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();

	}
}
