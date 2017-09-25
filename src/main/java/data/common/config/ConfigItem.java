package data.common.config;

import java.util.List;

public class ConfigItem {
	private String class_name;
	private int instance;
	private int order;
	private List<String> add_output;
	private List<ConfigItem> filters;
	private String command;
	private int schedule;
	public String getClass_name() {
		return class_name;
	}
	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}
	public int getInstance() {
		return instance;
	}
	public void setInstance(int count) {
		this.instance = count;
	}
	public int getOrder() {
		return order;
	}
	public void setOrder(int order) {
		this.order = order;
	}
	public List<String> getAdd_output() {
		return add_output;
	}
	public void setAdd_output(List<String> add_output) {
		this.add_output = add_output;
	}
	public List<ConfigItem> getFilters() {
		return filters;
	}
	public void setFilters(List<ConfigItem> filters) {
		this.filters = filters;
	}
	public String getCommand() {
		return command;
	}
	public void setCommand(String command) {
		this.command = command;
	}
	public int getSchedule() {
		return schedule;
	}
	public void setSchedule(int schedule) {
		this.schedule = schedule;
	}
}
