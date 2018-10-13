package com.io7m.javafxhello;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.util.logging.Logger;

public final class ExampleApplication extends Application
{
  private static final Logger LOG =
    Logger.getLogger(ExampleApplication.class.getCanonicalName());

  public ExampleApplication()
  {

  }

  @Override
  public void start(
    final Stage stage)
  {
    LOG.info("started");

    final Button button = new Button();
    button.setText("Click");

    final BorderPane pane = new BorderPane();
    pane.setCenter(button);

    final Scene scene = new Scene(pane, 640.0, 480.0);
    stage.setScene(scene);
    stage.setTitle("Example");
    stage.show();
  }
}
