package com.al.dbspider.temp;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;

/**
 * NOTE:
 *
 * @Version 1.0
 * @Since JDK1.8
 * @Author mr.wang
 * @Company 洛阳艾鹿网络有限公司
 * @Date 2018/7/21 20:05
 */
@Slf4j
public class Jsonconver {


    public static void main(String[] args) {
        Position position = JSONObject.toJavaObject(JSONObject.parseObject(jsonString), Position.class);
        log.info(JSONObject.toJSONString(position));
    }


    static String jsonString = "{\n" +
            "  \"coin\": \"BTC\",\n" +
            "  \"holdAmount\": 5992563,\n" +
            "  \"volume\": 19890626.0,\n" +
            "  \"line\": {\n" +
            "    \"data1\": [\n" +
            "      [\n" +
            "        1531990800000,\n" +
            "        184115.93560652543\n" +
            "      ],\n" +
            "      [\n" +
            "        1531994400000,\n" +
            "        183228.10700741145\n" +
            "      ],\n" +
            "      [\n" +
            "        1531998000000,\n" +
            "        182918.51874816703\n" +
            "      ],\n" +
            "      [\n" +
            "        1532001600000,\n" +
            "        182793.11880328684\n" +
            "      ],\n" +
            "      [\n" +
            "        1532005200000,\n" +
            "        181589.65271492972\n" +
            "      ],\n" +
            "      [\n" +
            "        1532008800000,\n" +
            "        182014.97739970396\n" +
            "      ],\n" +
            "      [\n" +
            "        1532012400000,\n" +
            "        182489.66329358102\n" +
            "      ],\n" +
            "      [\n" +
            "        1532016000000,\n" +
            "        182441.57297842187\n" +
            "      ],\n" +
            "      [\n" +
            "        1532019600000,\n" +
            "        183655.62541230913\n" +
            "      ],\n" +
            "      [\n" +
            "        1532023200000,\n" +
            "        182260.65773692197\n" +
            "      ],\n" +
            "      [\n" +
            "        1532026800000,\n" +
            "        182184.64799578334\n" +
            "      ],\n" +
            "      [\n" +
            "        1532030400000,\n" +
            "        180818.3736224107\n" +
            "      ],\n" +
            "      [\n" +
            "        1532034000000,\n" +
            "        180360.8363220603\n" +
            "      ],\n" +
            "      [\n" +
            "        1532037600000,\n" +
            "        180220.01135615617\n" +
            "      ],\n" +
            "      [\n" +
            "        1532041200000,\n" +
            "        181378.66286505043\n" +
            "      ],\n" +
            "      [\n" +
            "        1532044800000,\n" +
            "        180569.8648403758\n" +
            "      ],\n" +
            "      [\n" +
            "        1532048400000,\n" +
            "        180572.59750259577\n" +
            "      ],\n" +
            "      [\n" +
            "        1532052000000,\n" +
            "        180555.24546137446\n" +
            "      ],\n" +
            "      [\n" +
            "        1532055600000,\n" +
            "        180505.86690301358\n" +
            "      ],\n" +
            "      [\n" +
            "        1532059200000,\n" +
            "        180501.0497975483\n" +
            "      ],\n" +
            "      [\n" +
            "        1532062800000,\n" +
            "        180285.53508580153\n" +
            "      ],\n" +
            "      [\n" +
            "        1532066400000,\n" +
            "        180124.0570849889\n" +
            "      ],\n" +
            "      [\n" +
            "        1532070000000,\n" +
            "        180963.01325986825\n" +
            "      ],\n" +
            "      [\n" +
            "        1532073600000,\n" +
            "        181881.32130566824\n" +
            "      ],\n" +
            "      [\n" +
            "        1532077200000,\n" +
            "        144745.8901253312\n" +
            "      ],\n" +
            "      [\n" +
            "        1532080800000,\n" +
            "        144726.84343850947\n" +
            "      ],\n" +
            "      [\n" +
            "        1532084400000,\n" +
            "        145548.35102817594\n" +
            "      ],\n" +
            "      [\n" +
            "        1532088000000,\n" +
            "        146055.30796380556\n" +
            "      ],\n" +
            "      [\n" +
            "        1532091600000,\n" +
            "        147061.8763671031\n" +
            "      ],\n" +
            "      [\n" +
            "        1532095200000,\n" +
            "        147482.52654619052\n" +
            "      ],\n" +
            "      [\n" +
            "        1532098800000,\n" +
            "        148489.13639434826\n" +
            "      ],\n" +
            "      [\n" +
            "        1532102400000,\n" +
            "        150200.71247065975\n" +
            "      ],\n" +
            "      [\n" +
            "        1532106000000,\n" +
            "        153510.1110993628\n" +
            "      ],\n" +
            "      [\n" +
            "        1532109600000,\n" +
            "        154015.45276776399\n" +
            "      ],\n" +
            "      [\n" +
            "        1532113200000,\n" +
            "        154701.60879411496\n" +
            "      ],\n" +
            "      [\n" +
            "        1532116800000,\n" +
            "        155505.30007895146\n" +
            "      ],\n" +
            "      [\n" +
            "        1532120400000,\n" +
            "        156103.88130507627\n" +
            "      ],\n" +
            "      [\n" +
            "        1532124000000,\n" +
            "        156197.13531627503\n" +
            "      ],\n" +
            "      [\n" +
            "        1532127600000,\n" +
            "        156554.52951614858\n" +
            "      ],\n" +
            "      [\n" +
            "        1532131200000,\n" +
            "        157836.60185507726\n" +
            "      ],\n" +
            "      [\n" +
            "        1532134800000,\n" +
            "        159380.30875133217\n" +
            "      ],\n" +
            "      [\n" +
            "        1532138400000,\n" +
            "        160603.13368859413\n" +
            "      ],\n" +
            "      [\n" +
            "        1532142000000,\n" +
            "        161422.2151651326\n" +
            "      ],\n" +
            "      [\n" +
            "        1532145600000,\n" +
            "        162125.89486868956\n" +
            "      ],\n" +
            "      [\n" +
            "        1532149200000,\n" +
            "        164563.42148694824\n" +
            "      ],\n" +
            "      [\n" +
            "        1532152800000,\n" +
            "        165406.10833085293\n" +
            "      ],\n" +
            "      [\n" +
            "        1532156400000,\n" +
            "        166859.203262548\n" +
            "      ],\n" +
            "      [\n" +
            "        1532160000000,\n" +
            "        167561.01806908392\n" +
            "      ],\n" +
            "      [\n" +
            "        1532163600000,\n" +
            "        167910.23245483148\n" +
            "      ],\n" +
            "      [\n" +
            "        1532167200000,\n" +
            "        168655.32533287987\n" +
            "      ]\n" +
            "    ],\n" +
            "    \"data2\": [\n" +
            "      [\n" +
            "        1531454400000,\n" +
            "        179352.7836352934\n" +
            "      ],\n" +
            "      [\n" +
            "        1531468800000,\n" +
            "        177927.74971579932\n" +
            "      ],\n" +
            "      [\n" +
            "        1531483200000,\n" +
            "        147420.87563454773\n" +
            "      ],\n" +
            "      [\n" +
            "        1531497600000,\n" +
            "        150676.306662394\n" +
            "      ],\n" +
            "      [\n" +
            "        1531512000000,\n" +
            "        153438.95550321706\n" +
            "      ],\n" +
            "      [\n" +
            "        1531526400000,\n" +
            "        154731.4354971605\n" +
            "      ],\n" +
            "      [\n" +
            "        1531540800000,\n" +
            "        156136.1704331747\n" +
            "      ],\n" +
            "      [\n" +
            "        1531555200000,\n" +
            "        159014.25294170348\n" +
            "      ],\n" +
            "      [\n" +
            "        1531569600000,\n" +
            "        160015.5468637248\n" +
            "      ],\n" +
            "      [\n" +
            "        1531584000000,\n" +
            "        161482.09167256512\n" +
            "      ],\n" +
            "      [\n" +
            "        1531598400000,\n" +
            "        164122.8715864207\n" +
            "      ],\n" +
            "      [\n" +
            "        1531612800000,\n" +
            "        165688.19277714938\n" +
            "      ],\n" +
            "      [\n" +
            "        1531627200000,\n" +
            "        167793.2340627463\n" +
            "      ],\n" +
            "      [\n" +
            "        1531641600000,\n" +
            "        169446.68878941657\n" +
            "      ],\n" +
            "      [\n" +
            "        1531656000000,\n" +
            "        170882.43979144408\n" +
            "      ],\n" +
            "      [\n" +
            "        1531670400000,\n" +
            "        171666.15704265557\n" +
            "      ],\n" +
            "      [\n" +
            "        1531684800000,\n" +
            "        171682.07380615594\n" +
            "      ],\n" +
            "      [\n" +
            "        1531699200000,\n" +
            "        172266.4137277986\n" +
            "      ],\n" +
            "      [\n" +
            "        1531713600000,\n" +
            "        172955.59154514008\n" +
            "      ],\n" +
            "      [\n" +
            "        1531728000000,\n" +
            "        174506.52292558562\n" +
            "      ],\n" +
            "      [\n" +
            "        1531742400000,\n" +
            "        172406.27484712863\n" +
            "      ],\n" +
            "      [\n" +
            "        1531756800000,\n" +
            "        173655.38876556017\n" +
            "      ],\n" +
            "      [\n" +
            "        1531771200000,\n" +
            "        175757.97679163583\n" +
            "      ],\n" +
            "      [\n" +
            "        1531785600000,\n" +
            "        175254.07317058183\n" +
            "      ],\n" +
            "      [\n" +
            "        1531800000000,\n" +
            "        174979.23338289806\n" +
            "      ],\n" +
            "      [\n" +
            "        1531814400000,\n" +
            "        175663.32331528337\n" +
            "      ],\n" +
            "      [\n" +
            "        1531828800000,\n" +
            "        175579.40887913684\n" +
            "      ],\n" +
            "      [\n" +
            "        1531843200000,\n" +
            "        176018.44271073974\n" +
            "      ],\n" +
            "      [\n" +
            "        1531857600000,\n" +
            "        174954.21326422095\n" +
            "      ],\n" +
            "      [\n" +
            "        1531872000000,\n" +
            "        175457.434774331\n" +
            "      ],\n" +
            "      [\n" +
            "        1531886400000,\n" +
            "        175596.46377772195\n" +
            "      ],\n" +
            "      [\n" +
            "        1531900800000,\n" +
            "        176375.4800515693\n" +
            "      ],\n" +
            "      [\n" +
            "        1531915200000,\n" +
            "        177605.2330539486\n" +
            "      ],\n" +
            "      [\n" +
            "        1531929600000,\n" +
            "        180544.05514283746\n" +
            "      ],\n" +
            "      [\n" +
            "        1531944000000,\n" +
            "        182321.01406587384\n" +
            "      ],\n" +
            "      [\n" +
            "        1531958400000,\n" +
            "        181582.01258593306\n" +
            "      ],\n" +
            "      [\n" +
            "        1531972800000,\n" +
            "        182869.20403225377\n" +
            "      ],\n" +
            "      [\n" +
            "        1531987200000,\n" +
            "        183759.0594203243\n" +
            "      ],\n" +
            "      [\n" +
            "        1532001600000,\n" +
            "        182793.11880328684\n" +
            "      ],\n" +
            "      [\n" +
            "        1532016000000,\n" +
            "        182441.57297842187\n" +
            "      ],\n" +
            "      [\n" +
            "        1532030400000,\n" +
            "        180818.3736224107\n" +
            "      ],\n" +
            "      [\n" +
            "        1532044800000,\n" +
            "        180569.8648403758\n" +
            "      ],\n" +
            "      [\n" +
            "        1532059200000,\n" +
            "        180501.0497975483\n" +
            "      ],\n" +
            "      [\n" +
            "        1532073600000,\n" +
            "        181881.32130566824\n" +
            "      ],\n" +
            "      [\n" +
            "        1532088000000,\n" +
            "        146055.30796380556\n" +
            "      ],\n" +
            "      [\n" +
            "        1532102400000,\n" +
            "        150200.71247065975\n" +
            "      ],\n" +
            "      [\n" +
            "        1532116800000,\n" +
            "        155505.30007895146\n" +
            "      ],\n" +
            "      [\n" +
            "        1532131200000,\n" +
            "        157836.60185507726\n" +
            "      ],\n" +
            "      [\n" +
            "        1532145600000,\n" +
            "        162125.89486868956\n" +
            "      ],\n" +
            "      [\n" +
            "        1532160000000,\n" +
            "        167561.01806908392\n" +
            "      ]\n" +
            "    ],\n" +
            "    \"data3\": [\n" +
            "      [\n" +
            "        1530028800000,\n" +
            "        176515.9593820889\n" +
            "      ],\n" +
            "      [\n" +
            "        1530072000000,\n" +
            "        174005.35187278947\n" +
            "      ],\n" +
            "      [\n" +
            "        1530115200000,\n" +
            "        174032.65934354355\n" +
            "      ],\n" +
            "      [\n" +
            "        1530158400000,\n" +
            "        174171.80300807097\n" +
            "      ],\n" +
            "      [\n" +
            "        1530201600000,\n" +
            "        177405.58739229463\n" +
            "      ],\n" +
            "      [\n" +
            "        1530244800000,\n" +
            "        180251.98057702556\n" +
            "      ],\n" +
            "      [\n" +
            "        1530288000000,\n" +
            "        146105.12084610618\n" +
            "      ],\n" +
            "      [\n" +
            "        1530331200000,\n" +
            "        165614.87157833367\n" +
            "      ],\n" +
            "      [\n" +
            "        1530374400000,\n" +
            "        172668.70199453316\n" +
            "      ],\n" +
            "      [\n" +
            "        1530417600000,\n" +
            "        180541.37906180878\n" +
            "      ],\n" +
            "      [\n" +
            "        1530460800000,\n" +
            "        181965.84444747237\n" +
            "      ],\n" +
            "      [\n" +
            "        1530504000000,\n" +
            "        182433.56753945706\n" +
            "      ],\n" +
            "      [\n" +
            "        1530547200000,\n" +
            "        182155.90805873965\n" +
            "      ],\n" +
            "      [\n" +
            "        1530590400000,\n" +
            "        179808.35670598623\n" +
            "      ],\n" +
            "      [\n" +
            "        1530633600000,\n" +
            "        177257.0983142113\n" +
            "      ],\n" +
            "      [\n" +
            "        1530676800000,\n" +
            "        174523.78939441088\n" +
            "      ],\n" +
            "      [\n" +
            "        1530720000000,\n" +
            "        171511.71932335407\n" +
            "      ],\n" +
            "      [\n" +
            "        1530763200000,\n" +
            "        168339.70918958454\n" +
            "      ],\n" +
            "      [\n" +
            "        1530806400000,\n" +
            "        167064.61324650754\n" +
            "      ],\n" +
            "      [\n" +
            "        1530849600000,\n" +
            "        166075.78243712435\n" +
            "      ],\n" +
            "      [\n" +
            "        1530892800000,\n" +
            "        140690.3440916571\n" +
            "      ],\n" +
            "      [\n" +
            "        1530936000000,\n" +
            "        148337.6298079912\n" +
            "      ],\n" +
            "      [\n" +
            "        1530979200000,\n" +
            "        154718.5942446796\n" +
            "      ],\n" +
            "      [\n" +
            "        1531022400000,\n" +
            "        163014.20810404434\n" +
            "      ],\n" +
            "      [\n" +
            "        1531065600000,\n" +
            "        165541.92142825716\n" +
            "      ],\n" +
            "      [\n" +
            "        1531108800000,\n" +
            "        169083.70412005254\n" +
            "      ],\n" +
            "      [\n" +
            "        1531152000000,\n" +
            "        174551.8739356434\n" +
            "      ],\n" +
            "      [\n" +
            "        1531195200000,\n" +
            "        178233.72035954823\n" +
            "      ],\n" +
            "      [\n" +
            "        1531238400000,\n" +
            "        179295.44909064585\n" +
            "      ],\n" +
            "      [\n" +
            "        1531281600000,\n" +
            "        180434.7138585387\n" +
            "      ],\n" +
            "      [\n" +
            "        1531324800000,\n" +
            "        183355.26758241578\n" +
            "      ],\n" +
            "      [\n" +
            "        1531368000000,\n" +
            "        182442.54148655332\n" +
            "      ],\n" +
            "      [\n" +
            "        1531411200000,\n" +
            "        180108.79827619664\n" +
            "      ],\n" +
            "      [\n" +
            "        1531454400000,\n" +
            "        179352.7836352934\n" +
            "      ],\n" +
            "      [\n" +
            "        1531497600000,\n" +
            "        150676.306662394\n" +
            "      ],\n" +
            "      [\n" +
            "        1531540800000,\n" +
            "        156136.1704331747\n" +
            "      ],\n" +
            "      [\n" +
            "        1531584000000,\n" +
            "        161482.09167256512\n" +
            "      ],\n" +
            "      [\n" +
            "        1531627200000,\n" +
            "        167793.2340627463\n" +
            "      ],\n" +
            "      [\n" +
            "        1531670400000,\n" +
            "        171666.15704265557\n" +
            "      ],\n" +
            "      [\n" +
            "        1531713600000,\n" +
            "        172955.59154514008\n" +
            "      ],\n" +
            "      [\n" +
            "        1531756800000,\n" +
            "        173655.38876556017\n" +
            "      ],\n" +
            "      [\n" +
            "        1531800000000,\n" +
            "        174979.23338289806\n" +
            "      ],\n" +
            "      [\n" +
            "        1531843200000,\n" +
            "        176018.44271073974\n" +
            "      ],\n" +
            "      [\n" +
            "        1531886400000,\n" +
            "        175596.46377772195\n" +
            "      ],\n" +
            "      [\n" +
            "        1531929600000,\n" +
            "        180544.05514283746\n" +
            "      ],\n" +
            "      [\n" +
            "        1531972800000,\n" +
            "        182869.20403225377\n" +
            "      ],\n" +
            "      [\n" +
            "        1532016000000,\n" +
            "        182441.57297842187\n" +
            "      ],\n" +
            "      [\n" +
            "        1532059200000,\n" +
            "        180501.0497975483\n" +
            "      ],\n" +
            "      [\n" +
            "        1532102400000,\n" +
            "        150200.71247065975\n" +
            "      ],\n" +
            "      [\n" +
            "        1532145600000,\n" +
            "        162125.89486868956\n" +
            "      ]\n" +
            "    ]\n" +
            "  },\n" +
            "  \"dateArry\": [\n" +
            "    \"2018-07-21 16:00:00\",\n" +
            "    \"2018-07-21 08:00:00\",\n" +
            "    \"2018-07-21 00:00:00\",\n" +
            "    \"2018-07-20 16:00:00\",\n" +
            "    \"2018-07-20 08:00:00\",\n" +
            "    \"2018-07-20 00:00:00\"\n" +
            "  ],\n" +
            "  \"list1\": [\n" +
            "    10600.482923577532,\n" +
            "    8488.120813027626,\n" +
            "    7115.469999425169,\n" +
            "    1987.986402606686,\n" +
            "    1689.459134721538,\n" +
            "    1635.712097052649,\n" +
            "    1437.577367460575,\n" +
            "    1400.974508874251,\n" +
            "    1381.610479249773,\n" +
            "    1315.721651511431\n" +
            "  ],\n" +
            "  \"list2\": [\n" +
            "    7115.469999425169,\n" +
            "    7075.46370618108,\n" +
            "    4182.429082472511,\n" +
            "    2639.109270623499,\n" +
            "    1939.287752847536,\n" +
            "    1713.378548829878,\n" +
            "    1635.712097052649,\n" +
            "    1437.577367460575,\n" +
            "    1400.974508874251,\n" +
            "    1381.610479249773\n" +
            "  ],\n" +
            "  \"list3\": [\n" +
            "    6574.165891960934,\n" +
            "    5553.128070410036,\n" +
            "    4182.429082472511,\n" +
            "    2639.109270623499,\n" +
            "    2131.744960162549,\n" +
            "    1794.808959013466,\n" +
            "    1713.378548829878,\n" +
            "    1669.724348201194,\n" +
            "    1437.577367460575,\n" +
            "    1400.974508874251\n" +
            "  ],\n" +
            "  \"list4\": [\n" +
            "    6574.165891960934,\n" +
            "    4582.041977689946,\n" +
            "    4182.429082472511,\n" +
            "    2639.109270623499,\n" +
            "    2220.0020045988,\n" +
            "    1942.190955308472,\n" +
            "    1746.726789842276,\n" +
            "    1669.724348201194,\n" +
            "    1400.974508874251,\n" +
            "    1286.80403012586\n" +
            "  ],\n" +
            "  \"list5\": [\n" +
            "    5774.16589192371,\n" +
            "    4582.041977689946,\n" +
            "    4182.429082472511,\n" +
            "    2639.109270623499,\n" +
            "    1884.24465574466,\n" +
            "    1746.726789842276,\n" +
            "    1669.724348201194,\n" +
            "    1400.974508874251,\n" +
            "    1377.770866342795,\n" +
            "    1296.005429678011\n" +
            "  ],\n" +
            "  \"list6\": [\n" +
            "    5774.16589192371,\n" +
            "    4182.429082472511,\n" +
            "    3915.375311037089,\n" +
            "    2631.6862416114,\n" +
            "    1881.516941334949,\n" +
            "    1746.726789842276,\n" +
            "    1669.724348201194,\n" +
            "    1400.974508874251,\n" +
            "    1400.546073849549,\n" +
            "    1296.005429678011\n" +
            "  ]\n" +
            "}";

}
