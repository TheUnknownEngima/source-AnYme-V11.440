package com.google.android.gms.measurement.internal;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

final class ha extends SSLSocket {
    private final SSLSocket e;

    ha(ja jaVar, SSLSocket sSLSocket) {
        this.e = sSLSocket;
    }

    public final void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.e.addHandshakeCompletedListener(handshakeCompletedListener);
    }

    public final void bind(SocketAddress socketAddress) {
        this.e.bind(socketAddress);
    }

    public final synchronized void close() {
        this.e.close();
    }

    public final void connect(SocketAddress socketAddress) {
        this.e.connect(socketAddress);
    }

    public final void connect(SocketAddress socketAddress, int i) {
        this.e.connect(socketAddress, i);
    }

    public final boolean equals(Object obj) {
        return this.e.equals(obj);
    }

    public final SocketChannel getChannel() {
        return this.e.getChannel();
    }

    public final boolean getEnableSessionCreation() {
        return this.e.getEnableSessionCreation();
    }

    public final String[] getEnabledCipherSuites() {
        return this.e.getEnabledCipherSuites();
    }

    public final String[] getEnabledProtocols() {
        return this.e.getEnabledProtocols();
    }

    public final InetAddress getInetAddress() {
        return this.e.getInetAddress();
    }

    public final InputStream getInputStream() {
        return this.e.getInputStream();
    }

    public final boolean getKeepAlive() {
        return this.e.getKeepAlive();
    }

    public final InetAddress getLocalAddress() {
        return this.e.getLocalAddress();
    }

    public final int getLocalPort() {
        return this.e.getLocalPort();
    }

    public final SocketAddress getLocalSocketAddress() {
        return this.e.getLocalSocketAddress();
    }

    public final boolean getNeedClientAuth() {
        return this.e.getNeedClientAuth();
    }

    public final boolean getOOBInline() {
        return this.e.getOOBInline();
    }

    public final OutputStream getOutputStream() {
        return this.e.getOutputStream();
    }

    public final int getPort() {
        return this.e.getPort();
    }

    public final synchronized int getReceiveBufferSize() {
        return this.e.getReceiveBufferSize();
    }

    public final SocketAddress getRemoteSocketAddress() {
        return this.e.getRemoteSocketAddress();
    }

    public final boolean getReuseAddress() {
        return this.e.getReuseAddress();
    }

    public final synchronized int getSendBufferSize() {
        return this.e.getSendBufferSize();
    }

    public final SSLSession getSession() {
        return this.e.getSession();
    }

    public final int getSoLinger() {
        return this.e.getSoLinger();
    }

    public final synchronized int getSoTimeout() {
        return this.e.getSoTimeout();
    }

    public final String[] getSupportedCipherSuites() {
        return this.e.getSupportedCipherSuites();
    }

    public final String[] getSupportedProtocols() {
        return this.e.getSupportedProtocols();
    }

    public final boolean getTcpNoDelay() {
        return this.e.getTcpNoDelay();
    }

    public final int getTrafficClass() {
        return this.e.getTrafficClass();
    }

    public final boolean getUseClientMode() {
        return this.e.getUseClientMode();
    }

    public final boolean getWantClientAuth() {
        return this.e.getWantClientAuth();
    }

    public final boolean isBound() {
        return this.e.isBound();
    }

    public final boolean isClosed() {
        return this.e.isClosed();
    }

    public final boolean isConnected() {
        return this.e.isConnected();
    }

    public final boolean isInputShutdown() {
        return this.e.isInputShutdown();
    }

    public final boolean isOutputShutdown() {
        return this.e.isOutputShutdown();
    }

    public final void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.e.removeHandshakeCompletedListener(handshakeCompletedListener);
    }

    public final void sendUrgentData(int i) {
        this.e.sendUrgentData(i);
    }

    public final void setEnableSessionCreation(boolean z) {
        this.e.setEnableSessionCreation(z);
    }

    public final void setEnabledCipherSuites(String[] strArr) {
        this.e.setEnabledCipherSuites(strArr);
    }

    public final void setEnabledProtocols(String[] strArr) {
        if (strArr != null && Arrays.asList(strArr).contains("SSLv3")) {
            ArrayList arrayList = new ArrayList(Arrays.asList(this.e.getEnabledProtocols()));
            if (arrayList.size() > 1) {
                arrayList.remove("SSLv3");
            }
            strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        this.e.setEnabledProtocols(strArr);
    }

    public final void setKeepAlive(boolean z) {
        this.e.setKeepAlive(z);
    }

    public final void setNeedClientAuth(boolean z) {
        this.e.setNeedClientAuth(z);
    }

    public final void setOOBInline(boolean z) {
        this.e.setOOBInline(z);
    }

    public final void setPerformancePreferences(int i, int i2, int i3) {
        this.e.setPerformancePreferences(i, i2, i3);
    }

    public final synchronized void setReceiveBufferSize(int i) {
        this.e.setReceiveBufferSize(i);
    }

    public final void setReuseAddress(boolean z) {
        this.e.setReuseAddress(z);
    }

    public final synchronized void setSendBufferSize(int i) {
        this.e.setSendBufferSize(i);
    }

    public final void setSoLinger(boolean z, int i) {
        this.e.setSoLinger(z, i);
    }

    public final synchronized void setSoTimeout(int i) {
        this.e.setSoTimeout(i);
    }

    public final void setTcpNoDelay(boolean z) {
        this.e.setTcpNoDelay(z);
    }

    public final void setTrafficClass(int i) {
        this.e.setTrafficClass(i);
    }

    public final void setUseClientMode(boolean z) {
        this.e.setUseClientMode(z);
    }

    public final void setWantClientAuth(boolean z) {
        this.e.setWantClientAuth(z);
    }

    public final void shutdownInput() {
        this.e.shutdownInput();
    }

    public final void shutdownOutput() {
        this.e.shutdownOutput();
    }

    public final void startHandshake() {
        this.e.startHandshake();
    }

    public final String toString() {
        return this.e.toString();
    }
}
