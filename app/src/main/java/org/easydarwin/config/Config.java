/*
	Copyright (c) 2012-2017 EasyDarwin.ORG.  All rights reserved.
	Github: https://github.com/EasyDarwin
	WEChat: EasyDarwin
	Website: http://www.easydarwin.org
*/

package org.easydarwin.config;

/**
 * 类Config的实现描述：
 */
public class Config {

    public static final String SERVER_IP = "serverIp";
    public static final String SERVER_PORT = "serverPort";
    public static final String STREAM_ID = "streamId";
    public static final String STREAM_ID_PREFIX = "";
    public static final String DEFAULT_SERVER_IP = "114.55.107.180";
    public static final String DEFAULT_SERVER_PORT = "10554";
    public static final String DEFAULT_STREAM_ID = STREAM_ID_PREFIX + String.valueOf((int) (Math.random() * 1000000 + 100000));
    public static final String PREF_NAME = "easy_pref";
    public static final String K_RESOLUTION = "k_resolution";

}
