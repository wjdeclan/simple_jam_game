package simplejam.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by Declan on 5/31/2016.
 */
public class MouseFollowStrategy extends Strategy implements InputProcessor {
    //Store last checked mouse position
    float mouseX = 0;
    float mouseY = 0;

    //Unused
    @Override
    public boolean keyDown(int keycode) {
        return false;
    }

    //Unused
    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    //Unused
    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    //Unused
    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    //Unused
    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    //Unused
    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        mouseX = screenX;
        mouseY = screenY;
        return false;
    }

    //Unused
    @Override
    public boolean scrolled(int amount) {
        return false;
    }

    @Override
    public Vector2 getMovement(float entityX, float entityY, float delta) {
        //Calculate movement vector, half the distance to the cursor every second
        Vector2 movement = new Vector2((mouseX - entityX) / 2 * delta,(mouseY - entityY) / 2 * delta);
        return movement;
    }
}