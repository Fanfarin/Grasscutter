package emu.grasscutter.server.packet.recv;

import emu.grasscutter.net.packet.*;
import emu.grasscutter.server.game.GameSession;
import emu.grasscutter.server.packet.send.PacketGetAuthkeyRsp;

@Opcodes(PacketOpcodes.GetAuthkeyReq)
public class HandlerGetAuthkeyReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        session.send(new PacketGetAuthkeyRsp());
    }
}
