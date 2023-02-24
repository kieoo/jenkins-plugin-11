package io.jenkins.plugins.sample;

import hudson.Extension;
import hudson.ExtensionList;
import jenkins.model.GlobalConfiguration;
import org.kohsuke.stapler.DataBoundSetter;

@Extension
public class HelloConfig extends GlobalConfiguration {
    public static HelloConfig get() {
        return ExtensionList.lookupSingleton(HelloConfig.class);
    }
    public HelloConfig() {
        load();
    }
    private String hubUrl;

    public String getHubUrl() {
        return hubUrl;
    }

    @DataBoundSetter
    public void setHubUrl(String hubUrl) {
        this.hubUrl = hubUrl;
        save();
    }
}
