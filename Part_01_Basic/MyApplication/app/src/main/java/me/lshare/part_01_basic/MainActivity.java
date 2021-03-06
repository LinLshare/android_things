package me.lshare.part_01_basic;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import me.lshare.part_01_basic.session1_ui.UIFragment;
import me.lshare.part_01_basic.sestion2_design.CoodinatorFragment;

public class MainActivity extends AppCompatActivity {


  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    changeSession(new UIFragment());
    changeSession(new CoodinatorFragment());
  }

  /**
   * 切换不同的Session
   */
  private void changeSession(Fragment fragment) {
    getSupportFragmentManager().beginTransaction()
        .replace(R.id.layout_container, fragment)
        .commit();
  }
}
