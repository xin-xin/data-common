package data.common.domain.rdbms;

import java.sql.Timestamp;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "benchmark")
public class Benchmark {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	@Column(name = "free_mem")
	@Basic(optional = true)
	private long free_mem;
	@Column(name = "allocated_mem")
	@Basic(optional = true)
	private long allocated_mem;
	@Column(name = "max_mem")
	@Basic(optional = true)
	private long max_mem;
	@Column(name = "queue")
	@Basic(optional = true)
	private String queue;
	@Column(name = "created_at")
	@Basic(optional = true)
	private Timestamp created_at;
	@Column(name = "module")
	@Basic(optional = true)
	private String module;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getFree_mem() {
		return free_mem;
	}

	public void setFree_mem(long free_mem) {
		this.free_mem = free_mem;
	}

	public long getAllocated_mem() {
		return allocated_mem;
	}

	public void setAllocated_mem(long allocated_mem) {
		this.allocated_mem = allocated_mem;
	}

	public long getMax_mem() {
		return max_mem;
	}

	public void setMax_mem(long max_mem) {
		this.max_mem = max_mem;
	}

	public String getQueue() {
		return queue;
	}

	public void setQueue(String queue) {
		this.queue = queue;
	}

	public Timestamp getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Timestamp created_at) {
		this.created_at = created_at;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}
}
