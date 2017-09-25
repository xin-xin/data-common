package data.common.config;

import java.util.List;

public class Configuration {
	private ConfigItem monitor;
	private List<Streamer> streamers;
	public ConfigItem getMonitor() {
		return monitor;
	}
	public void setMonitor(ConfigItem monitor) {
		this.monitor = monitor;
	}
	public List<Streamer> getStreamers() {
		return streamers;
	}
	public void setStreamers(List<Streamer> streamers) {
		this.streamers = streamers;
	}
	
	public class Streamer{
		private ConfigItem capture;
		private List<ConfigItem> processor;
		private ConfigItem monitor;
		public ConfigItem getCapture() {
			return capture;
		}
		public void setCapture(ConfigItem capture) {
			this.capture = capture;
		}
		public List<ConfigItem> getProcessor() {
			return processor;
		}
		public void setProcessor(List<ConfigItem> processor) {
			this.processor = processor;
		}
		public ConfigItem getMonitor() {
			return monitor;
		}
		public void setMonitor(ConfigItem monitor) {
			this.monitor = monitor;
		}
	}
}
