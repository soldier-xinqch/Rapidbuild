//package com.rapidbuild.log.config;
//
//import org.apache.logging.log4j.Level;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.apache.logging.log4j.core.Appender;
//import org.apache.logging.log4j.core.Layout;
//import org.apache.logging.log4j.core.LoggerContext;
//import org.apache.logging.log4j.core.appender.FileAppender;
//import org.apache.logging.log4j.core.config.AppenderRef;
//import org.apache.logging.log4j.core.config.Configuration;
//import org.apache.logging.log4j.core.config.LoggerConfig;
//import org.apache.logging.log4j.core.layout.PatternLayout;
//import org.slf4j.LoggerFactory;
//
///**
// * Created by Administrator on 2017/6/14.
// */
//public class LogConfig {
//
//    public static void logInit(int jobId){
//        //为false时，返回多个LoggerContext对象，   true：返回唯一的单例LoggerContext
//        final LoggerContext ctx = (LoggerContext) LogManager.getContext(false);
//        final Configuration config = ctx.getConfiguration();
//
//
//        new String("");
//
//
//
//
//        //创建一个展示的样式：PatternLayout，   还有其他的日志打印样式。
////        Layout layout = PatternLayout.createLayout()
////                .createLayout(PatternLayout.DEFAULT_CONVERSION_PATTERN,
////                config, null, null, true, false, null, null);
//
//        //  日志打印方式——输出为文件
//        Appender appender = FileAppender.createAppender(
//                String.format("logs/test/syncshows-job-%s.log", jobId), "true", "false",
//                "" + jobId, null, "true", "true", null, layout, null, null, null, config);
//        appender.start();
//
//        config.addAppender(appender);
//        AppenderRef ref = AppenderRef.createAppenderRef("" + jobId, null, null);
//        AppenderRef[] refs = new AppenderRef[]{ref};
//        LoggerConfig loggerConfig = LoggerConfig.createLogger("false", Level.ALL, "" + jobId,
//                "true", refs, null, config, null);
//        loggerConfig.addAppender(appender, null, null);
//        config.addLogger("" + jobId, loggerConfig);
//        ctx.updateLoggers();
//    }
//
//    public static void stop(int jobId) {
//        final LoggerContext ctx = (LoggerContext) LogManager.getContext(false);
//        final Configuration config = ctx.getConfiguration();
//        config.getAppender("" + jobId).stop();
//        config.getLoggerConfig("" + jobId).removeAppender("" + jobId);
//        config.removeLogger("" + jobId);
//        ctx.updateLoggers();
//    }
//    /**
//     * 获取Logger
//     *
//     * 如果不想使用slf4j,那这里改成直接返回Log4j的Logger即可
//     * @param jobId
//     * @return
//     */
//    public static Logger createLogger(int jobId) {
//        logInit(jobId);
//        return (Logger) LoggerFactory.getLogger("" + jobId);
//    }
//}
