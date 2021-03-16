package com.example.shardingspheredemo.sharding;

import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.api.sharding.hint.HintShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.hint.HintShardingValue;
import org.springframework.util.CollectionUtils;

import java.util.Collection;
import java.util.stream.Collectors;

@Slf4j
public class DatabaseHintShardingAlgorithm implements HintShardingAlgorithm<String> {

    public DatabaseHintShardingAlgorithm() {
        log.info("初始化 DatabaseHintShardingAlgorithm");
    }


    @Override
    public Collection<String> doSharding(Collection<String> availableTargetNames, HintShardingValue<String> shardingValue) {
        log.info("进入doSharding:{}", availableTargetNames);
        if (!CollectionUtils.isEmpty(shardingValue.getValues())) {
            return availableTargetNames.stream().filter(availableTargetName ->
                    shardingValue.getValues().contains(availableTargetName)).collect(Collectors.toList());
        }
        return availableTargetNames;
    }
}
