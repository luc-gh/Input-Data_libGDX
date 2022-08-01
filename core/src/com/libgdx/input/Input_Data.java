package com.libgdx.input;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Input; //classe com funções de entrada de dados multi-plataforma
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Input_Data extends ApplicationAdapter {

	ShapeRenderer shape;

	float circleX = 200f;
	float circleY = 100f;
	
	@Override
	public void create () {
		shape = new ShapeRenderer();
	}

	@Override
	public void render () {

		if(Gdx.input.isTouched()){   //verifica posição do click
			circleX = Gdx.input.getX();
			circleX = Gdx.input.getY();
		}

        //Se houver teclado, verifica os clicks nos botões:
		if(Gdx.input.isKeyPressed(Input.Keys.W)){  //tecla W -> para cima
			circleY++;
		}
		if(Gdx.input.isKeyPressed(Input.Keys.A)){  //tecla A -> para esquerda
			circleX--;
		}
		if(Gdx.input.isKeyPressed(Input.Keys.S)){  //tecla S -> para baixo
			circleY--;
		}
		if(Gdx.input.isKeyPressed(Input.Keys.D)){  //tecla D -> para direita
			circleX++;
		}

        //cor de fundo
        Gdx.gl.glClearColor(.25f,.25f,.25f,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        //círculo
        shape.begin(ShapeRenderer.ShapeType.Filled);
        shape.setColor(.25f,.75f,.5f,1);
        shape.circle(circleX, circleY,75);
        shape.end();

	}
	
	@Override
	public void dispose () {
		shape.dispose();
	}
}
