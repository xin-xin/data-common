package data.common.config;

import java.util.List;

public class ConfigItem {
	private String className;
	private int instance;
	private int order;
	private List<String> addOutput;
	private List<ConfigItem> filters;
	private String command;
	private int schedule;

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
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

	public List<String> getAddOutput() {
		return addOutput;
	}

	public void setAddOutput(List<String> addOutput) {
		this.addOutput = addOutput;
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
