package watcher;

import lombok.extern.slf4j.Slf4j;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by huangwt on 2018/3/24.
 */
@Slf4j
public class SessionWatcher implements Watcher {
    private final Logger log = LoggerFactory.getLogger(this.getClass());
    public void process(WatchedEvent event) {
        if (event.getState() == Event.KeeperState.SyncConnected) {
            log.info("get zookeeper success");
        }
    }
}
