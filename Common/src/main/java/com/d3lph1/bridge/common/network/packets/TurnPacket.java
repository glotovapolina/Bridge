package com.d3lph1.bridge.common.network.packets;

import com.d3lph1.bridge.common.network.Packet;

public class TurnPacket implements Packet
{
    @Override
    public String toString()
    {
        return String.format("%s()", getClass().getSimpleName());
    }
}
