package com.libgdx.input;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.MathUtils;

public class Input_Data extends ApplicationAdapter {

	ShapeRenderer shape;

	float r = MathUtils.random();
	float g = MathUtils.random();
	float b = MathUtils.random();

	@Override
	public void create () {
		shape = new ShapeRenderer();

		Gdx.input.setInputProcessor(new InputAdapter(){
			@Override
			public boolean keyTyped(char key){
				r = MathUtils.random();
				g = MathUtils.random();
                b = MathUtils.random();
				return true;
			}

			@Override
			public boolean touchDown(int x, int y, int pointer, int button){
				r = MathUtils.random();
				g = MathUtils.random();
				b = MathUtils.random();
				return true;
			}
		});
	}

	@Override
	public void render () {  //cor de fundo
        Gdx.gl.glClearColor(r, g, b,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	}
	
	@Override
	public void dispose () {
		shape.dispose();
	}
}
