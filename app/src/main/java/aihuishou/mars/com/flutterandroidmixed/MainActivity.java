package aihuishou.mars.com.flutterandroidmixed;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.flutter.app.FlutterActivity;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugins.GeneratedPluginRegistrant;

public class MainActivity extends FlutterActivity {

//    private FlutterView flutterView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

//        flutterView = Flutter.createView(this, getLifecycle(), "route1");
//
//        FrameLayout.LayoutParams layout = new FrameLayout.LayoutParams(600, 800);
//        layout.leftMargin = 100;
//        layout.topMargin = 200;
//        addContentView(flutterView, layout);

        GeneratedPluginRegistrant.registerWith(this);
        registerCustomPlugin(this);


    }

    private static void registerCustomPlugin(PluginRegistry registrar) {
        FlutterPluginJumpToAct.registerWith(registrar.registrarFor(FlutterPluginJumpToAct.CHANNEL));
        FlutterPluginCounter.registerWith(registrar.registrarFor(FlutterPluginCounter.CHANNEL));
    }

}
