package com.pingan.jinke.infra.padis.core;

import com.pingan.jinke.infra.padis.common.HostAndPort;
import com.pingan.jinke.infra.padis.common.ObjectFactory;

public class ClientFactory implements ObjectFactory<Client> {

	private HostAndPort hostPort;

	public ClientFactory(String host, int port) {
		this(new HostAndPort(host, port));
	}

	public ClientFactory(HostAndPort hostPort) {
		this.hostPort = hostPort;
	}

	@Override
	public Client make() {
		return new Client(hostPort);
	}

}