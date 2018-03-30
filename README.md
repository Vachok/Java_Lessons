Exception in thread "main" java.util.regex.PatternSyntaxException: Dangling meta character '?' near index 0
?:\Q*\d+*\E+
^
	at java.base/java.util.regex.Pattern.error(Pattern.java:2010)
	at java.base/java.util.regex.Pattern.sequence(Pattern.java:2185)
	at java.base/java.util.regex.Pattern.expr(Pattern.java:2051)
	at java.base/java.util.regex.Pattern.compile(Pattern.java:1773)
	at java.base/java.util.regex.Pattern.<init>(Pattern.java:1422)
	at java.base/java.util.regex.Pattern.compile(Pattern.java:1082)
	at regex.starplus.StarPlus.main(StarPlus.java:11)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:564)
	at com.intellij.rt.execution.application.AppMainV2.main(AppMainV2.java:131)
