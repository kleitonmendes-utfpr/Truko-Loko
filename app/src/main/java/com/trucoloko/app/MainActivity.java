package com.trucoloko.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        show(R.layout.screen_lobby);
    }

    private void show(int layout) {
        setContentView(layout);
    }

    public void openLobby(View view) { show(R.layout.screen_lobby); }
    public void openGame(View view) { show(R.layout.screen_game); }
    public void openRoundResult(View view) { show(R.layout.screen_round_result); }
    public void openVictory(View view) { show(R.layout.screen_victory); }
    public void openDefeat(View view) { show(R.layout.screen_defeat); }
    public void openSpectator(View view) { show(R.layout.screen_spectator); }
    public void openRanking(View view) { show(R.layout.screen_ranking); }
    public void openProfile(View view) { show(R.layout.screen_profile); }
}
