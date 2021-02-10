package com.javaFundementals;

// logging을 위한 class를 가져옵니다.
import java.util.logging.Logger;
// logging level을 구분해주는 값들을 가져옵니다.
import java.util.logging.Level;
// logging이 console에서 이뤄지도록 하는 class를 가져옵니다.
import java.util.logging.ConsoleHandler;
// logging의 파일 위치에 대한 설정이 담긴 class를 가져옵니다.
import java.util.logging.FileHandler;
// logging의 서식 중 simpleFormatter에 관한 class를 가져옵니다.
import java.util.logging.SimpleFormatter;

// logging level
// SEVERE
// WARNING
// INFO
// CONFIG
// FINE
// FINER
// FINEST

public class Log {
    // 공개의 변동치 않는 Log class의 Logger 타입인 객체 logger를 생성합니다.
    public static final Logger logger = Logger.getLogger(Log.class.getName());

    // init을 불러야 파일 세팅 및 설정을 완료합니다. main에 넣어주세요.
    public static void init() {
        // logger의 level을 모두 가져오도록 합니다.
        logger.setLevel(Level.ALL);

        // consoleHandler 객체를 생성합니다.
        ConsoleHandler consoleHandler = new ConsoleHandler();

        // consoleHandler 객체의 level을 모두 가져오게 합니다.
        consoleHandler.setLevel(Level.ALL);

        // logger과 consoleHandler를 연결합니다.
        logger.addHandler(consoleHandler);

        // 파일의 생성, 편집의 관한 내용임으로 try 문에 넣습니다.
        try {

            // consoleHandler 객체가 연결된 파일명을 지정하고
            // 덮어쓰기(false)/이어쓰기(true)를 결정합니다.
            FileHandler fileHandler = new FileHandler("abc.log", true);

            // simpleFormatter로 서식을 지정합니다. 기본은 xml.
            fileHandler.setFormatter(new SimpleFormatter());

            // fileHandler 객체의 level을 모두 가져오게 합니다.
            fileHandler.setLevel(Level.ALL);

            // logger과 fileHandler를 연결합니다.
            logger.addHandler(fileHandler);

            // 파일이 연결되지 않았을 경우
        } catch (Exception e) {
            // logger.log는 e와 같이 객체를 더 받을 수 있습니다.
            logger.log(Level.SEVERE, "File read error", e);
        }
    }
}
