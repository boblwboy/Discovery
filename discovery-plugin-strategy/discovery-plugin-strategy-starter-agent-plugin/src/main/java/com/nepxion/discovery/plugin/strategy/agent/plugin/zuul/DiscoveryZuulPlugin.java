package com.nepxion.discovery.plugin.strategy.agent.plugin.zuul;

/**
 * <p>Title: Nepxion Discovery</p>
 * <p>Description: Nepxion Discovery</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author zifeihan
 * @version 1.0
 */

import com.nepxion.discovery.plugin.strategy.agent.plugin.AbstractPlugin;

public class DiscoveryZuulPlugin extends AbstractPlugin {
    @Override
    protected String getMatcherClassName() {
        return "com.nepxion.discovery.plugin.strategy.zuul.context.ZuulStrategyContext";
    }

    @Override
    protected String getHookClassName() {
        return ZuulStrategyContextHook.class.getName();
    }
}