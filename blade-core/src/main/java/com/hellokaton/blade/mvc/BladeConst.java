/**
 * Copyright (c) 2022, katon (hellokaton@gmail.com)
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.hellokaton.blade.mvc;

import com.hellokaton.blade.kit.BladeKit;
import com.hellokaton.blade.kit.StringKit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Blade Const
 *
 * @author hellokaton 2022/5/3
 */
public interface BladeConst {

    int DEFAULT_SERVER_PORT = 9000;
    String DEFAULT_SERVER_ADDRESS = "0.0.0.0";
    String LOCAL_IP_ADDRESS = "127.0.0.1";
    String VERSION = "2.1.1.RELEASE";
    String WEB_JARS = "/webjars/";
    String CLASSPATH = BladeKit.getCurrentClassPath();
    String HTTP_DATE_FORMAT = "EEE, dd MMM yyyy HH:mm:ss zzz";
    String INTERNAL_SERVER_ERROR_HTML = "<center><h1>500 Internal Server Error</h1><hr/></center>";
    String DEFAULT_THREAD_NAME = "_(:3」∠)_";
    List<String> PLUGIN_PACKAGE_NAME = new ArrayList<>(Collections.singletonList("com.hellokaton.blade.plugin"));
    List<String> DEFAULT_STATICS = new ArrayList<>(
            Arrays.asList("/favicon.ico", "/robots.txt", "/static", "/upload", "/webjars/"));

    String PROP_NAME = "classpath:application.properties";

    // Env key
    String ENV_KEY_DEV_MODE = "app.dev-mode";
    String ENV_KEY_APP_NAME = "app.name";
    String ENV_KEY_APP_ENV = "app.env";
    String ENV_KEY_APP_THREAD_NAME = "app.thread-name";
    String ENV_KEY_APP_WATCH_ENV = "app.watch-env";
    String ENV_KEY_BANNER_PATH = "app.banner-path";
    String ENV_KEY_TASK_THREAD_COUNT = "app.task.thread-count";
    String ENV_KEY_CONTEXT_PATH = "app.context-path";
    String ENV_KEY_HTTP_MAX_CONTENT = "http.max-content-size";
    String ENV_KEY_GZIP_ENABLE = "http.gzip.enabled";
    String ENV_KEY_SESSION_ENABLED = "http.session.enabled";
    String ENV_KEY_SESSION_KEY = "http.session.key";
    String ENV_KEY_SESSION_TIMEOUT = "http.session.timeout";
    String ENV_KEY_HTTP_CACHE_TIMEOUT = "http.cache.timeout";
    String ENV_KEY_HTTP_REQUEST_COST = "http.request.cost";
    String ENV_KEY_PAGE_404 = "mvc.view.404";
    String ENV_KEY_PAGE_500 = "mvc.view.500";
    String ENV_KEY_STATIC_DIRS = "mvc.statics";
    String ENV_KEY_STATIC_LIST = "mvc.statics.show-list";
    String ENV_KEY_TEMPLATE_PATH = "mvc.template.path";
    String ENV_KEY_SERVER_ADDRESS = "server.address";
    String ENV_KEY_SERVER_PORT = "server.port";
    String ENV_KEY_PERFORMANCE = "server.performance";
    String ENV_KEY_SSL = "server.ssl.enable";
    String ENV_KEY_SSL_CERT = "server.ssl.cert-path";
    String ENV_KEY_SSL_PRIVATE_KEY = "server.ssl.private-key-path";
    String ENV_KEY_SSL_PRIVATE_KEY_PASS = "server.ssl.private-key-pass";
    String ENV_KEY_NETTY_TCP_NODELAY = "server.netty.tcp-nodelay";
    String ENV_KEY_NETTY_SO_KEEPALIVE = "server.netty.so-keepalive";
    String ENV_KEY_NETTY_SO_BACKLOG = "server.netty.so-backlog";
    String ENV_KEY_NETTY_ACCEPT_THREAD_COUNT = "server.netty.accept-thread-count";
    String ENV_KEY_NETTY_IO_THREAD_COUNT = "server.netty.io-thread-count";

    String ENV_KEY_BOOT_CONF = "boot_conf";
    String ENV_KEY_AUTO_REFRESH_DIR = "app.auto.refresh.dir";

    /**
     * A request processing ends the elapsed time, in milliseconds.
     */
    String REQUEST_COST_TIME = "costTime";

    String NEW_LINE = "\r\n";

    int BANNER_PADDING = 60;
    String BANNER_TEXT = NEW_LINE +
            StringKit.padLeft("__, _,   _, __, __,", BANNER_PADDING) + NEW_LINE +
            StringKit.padLeft("|_) |   /_\\ | \\ |_", BANNER_PADDING - 1) + NEW_LINE +
            StringKit.padLeft("|_) | , | | |_/ |", BANNER_PADDING - 2) + NEW_LINE +
            StringKit.padLeft("~   ~~~ ~ ~ ~   ~~~", BANNER_PADDING);
}
