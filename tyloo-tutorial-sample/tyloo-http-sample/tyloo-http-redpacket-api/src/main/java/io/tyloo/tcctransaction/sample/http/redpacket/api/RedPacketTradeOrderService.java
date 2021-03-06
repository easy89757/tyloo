package io.tyloo.tcctransaction.sample.http.redpacket.api;

import io.tyloo.api.TylooContext;
import io.tyloo.tcctransaction.sample.http.redpacket.api.dto.RedPacketTradeOrderDto;

/*
 *
 * @Author:Zh1Cheung 945503088@qq.com
 * @Date: 10:07 2019/12/5
 *
 */
public interface RedPacketTradeOrderService {

    public String record(TylooContext transactionContext, RedPacketTradeOrderDto tradeOrderDto);
}
