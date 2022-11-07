package org.apache.apisix.plugin.runner;

import org.apache.apisix.plugin.runner.filter.PluginFilter;
import org.apache.apisix.plugin.runner.filter.PluginFilterChain;
import org.springframework.stereotype.Component;

@Component
public class MyPlugin implements PluginFilter {
    @Override
    public String name() {
        return "abc";
    }

    @Override
    public void filter(HttpRequest request, HttpResponse response, PluginFilterChain chain) {
        System.out.println("Filter is invoked.");
    }
}
