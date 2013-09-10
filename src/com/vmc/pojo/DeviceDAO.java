package com.vmc.pojo;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * Device entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.vmc.pojo.Device
 * @author MyEclipse Persistence Tools
 */
public class DeviceDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(DeviceDAO.class);
	// property constants
	public static final String MAC = "mac";
	public static final String BELONG = "belong";
	public static final String PEER_ID = "peerId";
	public static final String IS_ONLINE = "isOnline";

	protected void initDao() {
		// do nothing
	}

	public void save(Device transientInstance) {
		log.debug("saving Device instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Device persistentInstance) {
		log.debug("deleting Device instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Device findById(java.lang.Integer id) {
		log.debug("getting Device instance with id: " + id);
		try {
			Device instance = (Device) getHibernateTemplate().get(
					"com.vmc.pojo.Device", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Device instance) {
		log.debug("finding Device instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Device instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Device as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByMac(Object mac) {
		return findByProperty(MAC, mac);
	}

	public List findByBelong(Object belong) {
		return findByProperty(BELONG, belong);
	}

	public List findByPeerId(Object peerId) {
		return findByProperty(PEER_ID, peerId);
	}

	public List findByIsOnline(Object isOnline) {
		return findByProperty(IS_ONLINE, isOnline);
	}

	public List findAll() {
		log.debug("finding all Device instances");
		try {
			String queryString = "from Device";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Device merge(Device detachedInstance) {
		log.debug("merging Device instance");
		try {
			Device result = (Device) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Device instance) {
		log.debug("attaching dirty Device instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Device instance) {
		log.debug("attaching clean Device instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static DeviceDAO getFromApplicationContext(ApplicationContext ctx) {
		return (DeviceDAO) ctx.getBean("DeviceDAO");
	}
}