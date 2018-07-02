package com.circles.life.test.helper;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.time.Instant;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.util.CollectionUtils;

import com.circles.life.test.data.TestConstants;
import com.circles.life.testframework.CommonUtils;
import com.google.gson.internal.LinkedTreeMap;

public class TestHelper {
	
	public static String getUniqueEmailAddress() {
		String email = System.currentTimeMillis() + getRandomNumber(1, 1000) + "@circles.com";
        if (email.startsWith("0")) {
            email = email.replace("0", "1");
        }
        return email;
	}
	
	public static int getRandomNumber(int min, int max) {

        Random ran = new Random();
        int x = min + ran.nextInt(max - min);
        return x;
    }


}
