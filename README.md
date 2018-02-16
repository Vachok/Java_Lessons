239581786112
Exception in Application start method
Exception in thread "main" java.lang.RuntimeException: Exception in Application start method
	at javafx.graphics/com.sun.javafx.application.LauncherImpl.launchApplication1(LauncherImpl.java:973)
	at javafx.graphics/com.sun.javafx.application.LauncherImpl.lambda$launchApplication$2(LauncherImpl.java:198)
	at java.base/java.lang.Thread.run(Thread.java:844)
Caused by: MediaException: MEDIA_UNSUPPORTED : Unrecognized file signature!
	at javafx.media/javafx.scene.media.Media.<init>(Media.java:411)
	at fx.media.Medi.start(Medi.java:23)
	at javafx.graphics/com.sun.javafx.application.LauncherImpl.lambda$launchApplication1$9(LauncherImpl.java:919)
	at javafx.graphics/com.sun.javafx.application.PlatformImpl.lambda$runAndWait$11(PlatformImpl.java:449)
	at javafx.graphics/com.sun.javafx.application.PlatformImpl.lambda$runLater$9(PlatformImpl.java:418)
	at java.base/java.security.AccessController.doPrivileged(Native Method)
	at javafx.graphics/com.sun.javafx.application.PlatformImpl.lambda$runLater$10(PlatformImpl.java:417)
	at javafx.graphics/com.sun.glass.ui.InvokeLaterDispatcher$Future.run(InvokeLaterDispatcher.java:96)
	at javafx.graphics/com.sun.glass.ui.win.WinApplication._runLoop(Native Method)
	at javafx.graphics/com.sun.glass.ui.win.WinApplication.lambda$runLoop$3(WinApplication.java:175)
	... 1 more
