package pansong291.xposed.quickenergy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONObject;
import pansong291.xposed.quickenergy.AntFarm.SendType;

public class Config
{
 public enum ShowMode
 {
  DIALOG, TOAST;
  public static final CharSequence[] nickNames =
  {"对话框", "toast气泡"};
  public CharSequence nickName()
  {
   return nickNames[ordinal()];
  }
 }

 public enum RecallAnimalType
 {
  ALWAYS, WHEN_THIEF, WHEN_HUNGRY, NEVER;
  public static final CharSequence[] nickNames =
  {"始终召回", "作贼时召回", "饥饿时召回", "不召回"};
  public CharSequence nickName()
  {
   return nickNames[ordinal()];
  }
 }

 private static final String TAG = Config.class.getCanonicalName();
 private static final String
 /* application */
 jn_immediateEffect = "immediateEffect", jn_showMode = "showMode", jn_recordLog = "recordLog",
 jn_enableForest = "enableForest", jn_enableFarm = "enableFarm",
 /* forest */
 jn_collectEnergy = "collectEnergy", jn_helpFriendCollect = "helpFriendCollect", jn_dontCollectList = "dontCollectList",
 jn_dontHelpCollectList = "dontHelpCollectList", jn_receiveForestTaskAward = "receiveForestTaskAward", jn_waterFriendList = "waterFriendList",
 /* farm */
 jn_rewardFriend = "rewardFriend", jn_sendBackAnimal = "sendBackAnimal", jn_sendType = "sendType",
 jn_sendTypeExcludeList = "sendTypeExcludeList", jn_recallAnimalType = "recallAnimalType", jn_receiveFarmToolReward = "receiveFarmToolReward",
 jn_useNewEggTool = "useNewEggTool", jn_harvestProduce = "harvestProduce", jn_donation = "donation",
 jn_answerQuestion = "answerQuestion", jn_receiveFarmTaskAward = "receiveFarmTaskAward", jn_feedAnimal = "feedAnimal",
 jn_useAccelerateTool = "useAccelerateTool", jn_notifyFriend = "notifyFriend", jn_feedFriendAnimalList = "feedFriendAnimalList",
 /* member */
 jn_receivePoint = "receivePoint";

 public static boolean shouldReloadConfig;
 public static boolean hasConfigChanged;

 /* application */
 private boolean immediateEffect;
 private ShowMode showMode;
 private boolean recordLog;
 private boolean enableForest;
 private boolean enableFarm;

 /* forest */
 private boolean collectEnergy;
 private boolean helpFriendCollect;
 private List<String> dontCollectList;
 private List<String> dontHelpCollectList;
 private boolean receiveForestTaskAward;
 private List<String> waterFriendList;

 /* farm */
 private boolean rewardFriend;
 private boolean sendBackAnimal;
 private SendType sendType;
 private List<String> sendTypeExcludeList;
 private RecallAnimalType recallAnimalType;
 private boolean receiveFarmToolReward;
 private boolean useNewEggTool;
 private boolean harvestProduce;
 private boolean donation;
 private boolean answerQuestion;
 private boolean receiveFarmTaskAward;
 private boolean feedAnimal;
 private boolean useAccelerateTool;
 private boolean notifyFriend;
 private List<String> feedFriendAnimalList;

 /* member */
 private boolean receivePoint;

 /* other */
 private boolean reInit;
 private static Config config;
 private static Map idMap;
 private static boolean hasIdMapChanged = false;
 private static String selfId;

 /* application */
 public static void setImmediateEffect(boolean b)
 {
  getConfig().immediateEffect = b;
  hasConfigChanged = true;
 }

 public static boolean immediateEffect()
 {
  return getConfig().immediateEffect;
 }

 public static void setShowMode(int i)
 {
  getConfig().showMode = ShowMode.values()[i];
  hasConfigChanged = true;
 }

 public static ShowMode showMode()
 {
  return getConfig().showMode;
 }

 public static void setRecordLog(boolean b)
 {
  getConfig().recordLog = b;
  hasConfigChanged = true;
 }

 public static boolean recordLog()
 {
  return getConfig().recordLog;
 }

 public static void setEnableForest(boolean b)
 {
  getConfig().enableForest = b;
  hasConfigChanged = true;
 }

 public static boolean enableForest()
 {
  return getConfig().enableForest;
 }

 public static void setEnableFarm(boolean b)
 {
  getConfig().enableFarm = b;
  hasConfigChanged = true;
 }

 public static boolean enableFarm()
 {
  return getConfig().enableFarm;
 }

 /* forest */
 public static void setCollectEnergy(boolean b)
 {
  getConfig().collectEnergy = b;
  hasConfigChanged = true;
 }

 public static boolean collectEnergy()
 {
  return getConfig().collectEnergy;
 }

 public static void setHelpFriendCollect(boolean b)
 {
  getConfig().helpFriendCollect = b;
  hasConfigChanged = true;
 }

 public static boolean helpFriendCollect()
 {
  return getConfig().helpFriendCollect;
 }

 public static List<String> getDontCollectList()
 {
  return getConfig().dontCollectList;
 }

 public static boolean dontCollect(String id)
 {
  return getConfig().dontCollectList.contains(id);
 }

 public static List<String> getDontHelpCollectList()
 {
  return getConfig().dontHelpCollectList;
 }

 public static boolean dontHelpCollect(String id)
 {
  return getConfig().dontHelpCollectList.contains(id);
 }

 public static void setReceiveForestTaskAward(boolean b)
 {
  getConfig().receiveForestTaskAward = b;
  hasConfigChanged = true;
 }

 public static boolean receiveForestTaskAward()
 {
  return getConfig().receiveForestTaskAward;
 }

 public static List<String> getWaterFriendList()
 {
  return getConfig().waterFriendList;
 }

 /* farm */
 public static void setRewardFriend(boolean b)
 {
  getConfig().rewardFriend = b;
  hasConfigChanged = true;
 }

 public static boolean rewardFriend()
 {
  return getConfig().rewardFriend;
 }

 public static void setSendBackAnimal(boolean b)
 {
  getConfig().sendBackAnimal = b;
  hasConfigChanged = true;
 }

 public static boolean sendBackAnimal()
 {
  return getConfig().sendBackAnimal;
 }

 public static List<String> getSendTypeExcludeList()
 {
  return getConfig().sendTypeExcludeList;
 }

 public static void setSendType(int i)
 {
  getConfig().sendType = SendType.values()[i];
  hasConfigChanged = true;
 }

 public static SendType sendType(String id)
 {
  if(getConfig().sendTypeExcludeList.contains(id))
  {
   return getConfig().sendType.another();
  }
  return getConfig().sendType;
 }

 public static void setRecallAnimalType(int i)
 {
  getConfig().recallAnimalType = RecallAnimalType.values()[i];
  hasConfigChanged = true;
 }

 public static RecallAnimalType recallAnimalType()
 {
  return getConfig().recallAnimalType;
 }

 public static void setReceiveFarmToolReward(boolean b)
 {
  getConfig().receiveFarmToolReward = b;
  hasConfigChanged = true;
 }

 public static boolean receiveFarmToolReward()
 {
  return getConfig().receiveFarmToolReward;
 }

 public static void setUseNewEggTool(boolean b)
 {
  getConfig().useNewEggTool = b;
  hasConfigChanged = true;
 }

 public static boolean useNewEggTool()
 {
  return getConfig().useNewEggTool;
 }

 public static void setHarvestProduce(boolean b)
 {
  getConfig().harvestProduce = b;
  hasConfigChanged = true;
 }

 public static boolean harvestProduce()
 {
  return getConfig().harvestProduce;
 }

 public static void setDonation(boolean b)
 {
  getConfig().donation = b;
  hasConfigChanged = true;
 }

 public static boolean donation()
 {
  return getConfig().donation;
 }

 public static void setAnswerQuestion(boolean b)
 {
  getConfig().answerQuestion = b;
  hasConfigChanged = true;
 }

 public static boolean answerQuestion()
 {
  return getConfig().answerQuestion;
 }

 public static void setReceiveFarmTaskAward(boolean b)
 {
  getConfig().receiveFarmTaskAward = b;
  hasConfigChanged = true;
 }

 public static boolean receiveFarmTaskAward()
 {
  return getConfig().receiveFarmTaskAward;
 }

 public static void setFeedAnimal(boolean b)
 {
  getConfig().feedAnimal = b;
  hasConfigChanged = true;
 }

 public static boolean feedAnimal()
 {
  return getConfig().feedAnimal;
 }

 public static void setUseAccelerateTool(boolean b)
 {
  getConfig().useAccelerateTool = b;
  hasConfigChanged = true;
 }

 public static boolean useAccelerateTool()
 {
  return getConfig().useAccelerateTool;
 }

 public static void setNotifyFriend(boolean b)
 {
  getConfig().notifyFriend = b;
  hasConfigChanged = true;
 }

 public static boolean notifyFriend()
 {
  return getConfig().notifyFriend;
 }

 public static List<String> getFeedFriendAnimal()
 {
  return getConfig().feedFriendAnimalList;
 }

 public static boolean feedFriendAnimal()
 {
  return getConfig().feedFriendAnimalList.size() > 0;
 }

 public static boolean feedFriendAnimal(String id)
 {
  return getConfig().feedFriendAnimalList.contains(id);
 }

 /* member */
 public static void setReceivePoint(boolean b)
 {
  getConfig().receivePoint = b;
  hasConfigChanged = true;
 }

 public static boolean receivePoint()
 {
  return getConfig().receivePoint;
 }

 /* other */
 private static Config getConfig()
 {
  if(config == null || shouldReloadConfig && config.immediateEffect)
  {
   shouldReloadConfig = false;
   String confJson = null;
   if(FileUtils.getConfigFile().exists())
    confJson = FileUtils.readFromFile(FileUtils.getConfigFile());
   config = json2Config(confJson);
  }
  return config;
 }

 public static void putIdMap(String key, String value)
 {
  if(getIdMap().containsKey(key))
  {
   if(!getIdMap().get(key).equals(value))
   {
    getIdMap().replace(key, value);
    hasIdMapChanged = true;
   }
  }else
  {
   getIdMap().put(key, value);
   hasIdMapChanged = true;
  }
 }

 public static boolean saveIdMap()
 {
  if(hasIdMapChanged)
  {
   StringBuilder sb = new StringBuilder();
   Set idSet = getIdMap().entrySet();
   for(Map.Entry entry: idSet)
   {
    sb.append(entry.getKey());
    sb.append(':');
    sb.append(entry.getValue());
    sb.append('\n');
   }
   hasIdMapChanged = !FileUtils.write2File(sb.toString(), FileUtils.getFriendIdMapFile());
  }
  return hasIdMapChanged;
 }

 public static String getSelfId()
 {
  if(selfId == null)
  {
   Set idSet = getIdMap().entrySet();
   for(Map.Entry entry: idSet)
    if(!entry.getValue().toString().contains("*"))
    {
     selfId = entry.getKey().toString();
     break;
    }
  }
  return selfId;
 }

 public static String getNameById(String id)
 {
  if(getIdMap().containsKey(id))
  {
   String n = getIdMap().get(id).toString();
   int ind = n.indexOf('(');
   if(ind > 0) n = n.substring(0, ind);
   return n;
  }
  return id;
 }

 public static Map getIdMap()
 {
  if(idMap == null)
  {
   idMap = new TreeMap<>();
   String str = FileUtils.readFromFile(FileUtils.getFriendIdMapFile());
   if(str != null && str.length() > 0)
   {
    try
    {
     String[] idSet = str.split("\n");
     for(String s: idSet)
     {
      Log.i(TAG, s);
      String[] entry = s.split(":");
      idMap.put(entry[0], entry[1]);
     }
    }catch(Exception e)
    {
     Log.printStackTrace(TAG, e);
     idMap.clear();
    }
   }
  }
  return idMap;
 }

 public static Config defInit()
 {
  Config c = new Config();
  c.reInit = true;

  c.immediateEffect = true;
  c.showMode = ShowMode.DIALOG;
  c.recordLog = true;
  c.enableForest = true;
  c.enableFarm = true;

  c.collectEnergy = true;
  c.helpFriendCollect = true;
  if(c.dontCollectList == null) c.dontCollectList = new ArrayList<>();
  if(c.dontHelpCollectList == null) c.dontHelpCollectList = new ArrayList<>();
  c.receiveForestTaskAward = true;
  if(c.waterFriendList == null) c.waterFriendList = new ArrayList<>();

  c.rewardFriend = true;
  c.sendBackAnimal = true;
  c.sendType = SendType.HIT;
  if(c.sendTypeExcludeList == null) c.sendTypeExcludeList = new ArrayList<>();
  c.recallAnimalType = RecallAnimalType.ALWAYS;
  c.receiveFarmToolReward = true;
  c.useNewEggTool = true;
  c.harvestProduce = true;
  c.donation = true;
  c.answerQuestion = true;
  c.receiveFarmTaskAward = true;
  c.feedAnimal = true;
  c.useAccelerateTool = true;
  c.notifyFriend = true;
  if(c.feedFriendAnimalList == null) c.feedFriendAnimalList = new ArrayList<>();

  c.receivePoint = true;
  return c;
 }

 public static boolean saveConfigFile()
 {
  return FileUtils.write2File(config2Json(config), FileUtils.getConfigFile());
 }

 public static Config json2Config(String json)
 {
  Config config = null;
  try
  {
   JSONObject jo = new JSONObject(removeOutcomment(json));
   JSONArray ja = null;
   config = new Config();

   if(jo.has(jn_immediateEffect))
    config.immediateEffect = jo.getBoolean(jn_immediateEffect);
   else
   {
    config.reInit = true;
    config.immediateEffect = true;
   }
   Log.i(TAG, jn_immediateEffect + ":" + config.immediateEffect);

   if(jo.has(jn_showMode))
    config.showMode = ShowMode.valueOf(jo.getString(jn_showMode));
   else
   {
    config.reInit = true;
    config.showMode = ShowMode.DIALOG;
   }
   Log.i(TAG, jn_showMode + ":" + config.showMode.name());

   if(jo.has(jn_recordLog))
    config.recordLog = jo.getBoolean(jn_recordLog);
   else
   {
    config.reInit = true;
    config.recordLog = true;
   }
   Log.i(TAG, jn_recordLog + ":" + config.recordLog);

   if(jo.has(jn_enableForest))
    config.enableForest = jo.getBoolean(jn_enableForest);
   else
   {
    config.reInit = true;
    config.enableForest = true;
   }
   Log.i(TAG, jn_enableForest + ":" + config.enableForest);

   if(jo.has(jn_enableFarm))
    config.enableFarm = jo.getBoolean(jn_enableFarm);
   else
   {
    config.reInit = true;
    config.enableFarm = true;
   }
   Log.i(TAG, jn_enableFarm + ":" + config.enableFarm);

   /* forest */
   if(jo.has(jn_collectEnergy))
    config.collectEnergy = jo.getBoolean(jn_collectEnergy);
   else
   {
    config.reInit = true;
    config.collectEnergy = true;
   }
   Log.i(TAG, jn_collectEnergy + ":" + config.collectEnergy);

   if(jo.has(jn_helpFriendCollect))
    config.helpFriendCollect = jo.getBoolean(jn_helpFriendCollect);
   else
   {
    config.reInit = true;
    config.helpFriendCollect = true;
   }
   Log.i(TAG, jn_helpFriendCollect + ":" + config.helpFriendCollect);

   config.dontCollectList = new ArrayList<>();
   Log.i(TAG, jn_dontCollectList + ":[");
   if(jo.has(jn_dontCollectList))
   {
    ja = jo.getJSONArray(jn_dontCollectList);
    for(int i = 0; i < ja.length(); i++)
    {
     config.dontCollectList.add(ja.getString(i));
     Log.i(TAG, config.dontCollectList.get(i) + ",");
    }
   }else
    config.reInit = true;

   config.dontHelpCollectList = new ArrayList<>();
   Log.i(TAG, jn_dontHelpCollectList + ":[");
   if(jo.has(jn_dontHelpCollectList))
   {
    ja = jo.getJSONArray(jn_dontHelpCollectList);
    for(int i = 0; i < ja.length(); i++)
    {
     config.dontHelpCollectList.add(ja.getString(i));
     Log.i(TAG, config.dontHelpCollectList.get(i) + ",");
    }
   }else
    config.reInit = true;

   if(jo.has(jn_receiveForestTaskAward))
    config.receiveForestTaskAward = jo.getBoolean(jn_receiveForestTaskAward);
   else
   {
    config.reInit = true;
    config.receiveForestTaskAward = true;
   }
   Log.i(TAG, jn_receiveForestTaskAward + ":" + config.receiveForestTaskAward);

   config.waterFriendList = new ArrayList<>();
   Log.i(TAG, jn_waterFriendList + ":[");
   if(jo.has(jn_waterFriendList))
   {
    ja = jo.getJSONArray(jn_waterFriendList);
    for(int i = 0; i < ja.length(); i++)
    {
     config.waterFriendList.add(ja.getString(i));
     Log.i(TAG, config.waterFriendList.get(i) + ",");
    }
   }else
    config.reInit = true;

   /* farm */
   if(jo.has(jn_rewardFriend))
    config.rewardFriend = jo.getBoolean(jn_rewardFriend);
   else
   {
    config.reInit = true;
    config.rewardFriend = true;
   }
   Log.i(TAG, jn_rewardFriend + ":" + config.rewardFriend);

   if(jo.has(jn_sendBackAnimal))
    config.sendBackAnimal = jo.getBoolean(jn_sendBackAnimal);
   else
   {
    config.reInit = true;
    config.sendBackAnimal = true;
   }
   Log.i(TAG, jn_sendBackAnimal + ":" + config.sendBackAnimal);

   if(jo.has(jn_sendType))
    config.sendType = SendType.valueOf(jo.getString(jn_sendType));
   else
   {
    config.reInit = true;
    config.sendType = SendType.HIT;
   }
   Log.i(TAG, jn_sendType + ":" + config.sendType.name());

   config.sendTypeExcludeList = new ArrayList<>();
   Log.i(TAG, jn_sendTypeExcludeList + ":[");
   if(jo.has(jn_sendTypeExcludeList))
   {
    ja = jo.getJSONArray(jn_sendTypeExcludeList);
    for(int i = 0; i < ja.length(); i++)
    {
     config.sendTypeExcludeList.add(ja.getString(i));
     Log.i(TAG, config.sendTypeExcludeList.get(i) + ",");
    }
   }else
    config.reInit = true;

   if(jo.has(jn_recallAnimalType))
    config.recallAnimalType = RecallAnimalType.valueOf(jo.getString(jn_recallAnimalType));
   else
   {
    config.reInit = true;
    config.recallAnimalType = RecallAnimalType.ALWAYS;
   }
   Log.i(TAG, jn_recallAnimalType + ":" + config.recallAnimalType.name());

   if(jo.has(jn_receiveFarmToolReward))
    config.receiveFarmToolReward = jo.getBoolean(jn_receiveFarmToolReward);
   else
   {
    config.reInit = true;
    config.receiveFarmToolReward = true;
   }
   Log.i(TAG, jn_receiveFarmToolReward + ":" + config.receiveFarmToolReward);

   if(jo.has(jn_useNewEggTool))
    config.useNewEggTool = jo.getBoolean(jn_useNewEggTool);
   else
   {
    config.reInit = true;
    config.useNewEggTool = true;
   }
   Log.i(TAG, jn_useNewEggTool + ":" + config.useNewEggTool);

   if(jo.has(jn_harvestProduce))
    config.harvestProduce = jo.getBoolean(jn_harvestProduce);
   else
   {
    config.reInit = true;
    config.harvestProduce = true;
   }
   Log.i(TAG, jn_harvestProduce + ":" + config.harvestProduce);

   if(jo.has(jn_donation))
    config.donation = jo.getBoolean(jn_donation);
   else
   {
    config.reInit = true;
    config.donation = true;
   }
   Log.i(TAG, jn_donation + ":" + config.donation);

   if(jo.has(jn_answerQuestion))
    config.answerQuestion = jo.getBoolean(jn_answerQuestion);
   else
   {
    config.reInit = true;
    config.answerQuestion = true;
   }
   Log.i(TAG, jn_answerQuestion + ":" + config.answerQuestion);

   if(jo.has(jn_receiveFarmTaskAward))
    config.receiveFarmTaskAward = jo.getBoolean(jn_receiveFarmTaskAward);
   else
   {
    config.reInit = true;
    config.receiveFarmTaskAward = true;
   }
   Log.i(TAG, jn_receiveFarmTaskAward + ":" + config.receiveFarmTaskAward);

   if(jo.has(jn_feedAnimal))
    config.feedAnimal = jo.getBoolean(jn_feedAnimal);
   else
   {
    config.reInit = true;
    config.feedAnimal = true;
   }
   Log.i(TAG, jn_feedAnimal + ":" + config.feedAnimal);

   if(jo.has(jn_useAccelerateTool))
    config.useAccelerateTool = jo.getBoolean(jn_useAccelerateTool);
   else
   {
    config.reInit = true;
    config.useAccelerateTool = true;
   }
   Log.i(TAG, jn_useAccelerateTool + ":" + config.useAccelerateTool);

   if(jo.has(jn_notifyFriend))
    config.notifyFriend = jo.getBoolean(jn_notifyFriend);
   else
   {
    config.reInit = true;
    config.notifyFriend = true;
   }
   Log.i(TAG, jn_notifyFriend + ":" + config.notifyFriend);

   config.feedFriendAnimalList = new ArrayList<>();
   Log.i(TAG, jn_feedFriendAnimalList + ":[");
   if(jo.has(jn_feedFriendAnimalList))
   {
    ja = jo.getJSONArray(jn_feedFriendAnimalList);
    for(int i = 0; i < ja.length(); i++)
    {
     config.feedFriendAnimalList.add(ja.getString(i));
     Log.i(TAG, config.feedFriendAnimalList.get(i) + ",");
    }
   }else
    config.reInit = true;

   /* member */
   if(jo.has(jn_receivePoint))
    config.receivePoint = jo.getBoolean(jn_receivePoint);
   else
   {
    config.reInit = true;
    config.receivePoint = true;
   }
   Log.i(TAG, jn_receivePoint + ":" + config.receivePoint);

  }catch(Exception e)
  {
   Log.printStackTrace(TAG, e);
   if(json != null)
    Log.showToastIgnoreConfig("配置文件格式有误，已重置配置文件", "");
   config = defInit();
  }
  if(config.reInit)
  {
   Log.i(TAG, "config.json is Reinited");
   FileUtils.write2File(json, FileUtils.getBackupFile(FileUtils.getConfigFile()));
   saveConfigFile();
  }else
  {
   String formated = config2Json(config);
   if(!formated.equals(json))
   {
    Log.i(TAG, "Reformat config.json");
    FileUtils.write2File(formated, FileUtils.getConfigFile());
   }
  }
  return config;
 }

 public static String config2Json(Config config)
 {
  JSONObject jo = new JSONObject();
  try
  {
   if(config == null) config = Config.defInit();

   jo.put(jn_immediateEffect, config.immediateEffect);

   jo.put(jn_showMode, config.showMode.name());

   jo.put(jn_recordLog, config.recordLog);

   jo.put(jn_enableForest, config.enableForest);

   jo.put(jn_enableFarm, config.enableFarm);

   /* forest */
   jo.put(jn_collectEnergy, config.collectEnergy);

   jo.put(jn_helpFriendCollect, config.helpFriendCollect);

   JSONArray ja = new JSONArray();
   for(String s: config.dontCollectList)
   {
    ja.put(s);
   }
   jo.put(jn_dontCollectList, ja);

   ja = new JSONArray();
   for(String s: config.dontHelpCollectList)
   {
    ja.put(s);
   }
   jo.put(jn_dontHelpCollectList, ja);

   jo.put(jn_receiveForestTaskAward, config.receiveForestTaskAward);

   ja = new JSONArray();
   for(String s: config.waterFriendList)
   {
    ja.put(s);
   }
   jo.put(jn_waterFriendList, ja);

   /* farm */
   jo.put(jn_rewardFriend, config.rewardFriend);

   jo.put(jn_sendBackAnimal, config.sendBackAnimal);

   jo.put(jn_sendType, config.sendType.name());

   ja = new JSONArray();
   for(String s: config.sendTypeExcludeList)
   {
    ja.put(s);
   }
   jo.put(jn_sendTypeExcludeList, ja);

   jo.put(jn_recallAnimalType, config.recallAnimalType);

   jo.put(jn_receiveFarmToolReward, config.receiveFarmToolReward);

   jo.put(jn_useNewEggTool, config.useNewEggTool);

   jo.put(jn_harvestProduce, config.harvestProduce);

   jo.put(jn_donation, config.donation);

   jo.put(jn_answerQuestion, config.answerQuestion);

   jo.put(jn_receiveFarmTaskAward, config.receiveFarmTaskAward);

   jo.put(jn_feedAnimal, config.feedAnimal);

   jo.put(jn_useAccelerateTool, config.useAccelerateTool);

   jo.put(jn_notifyFriend, config.notifyFriend);

   ja = new JSONArray();
   for(String s: config.feedFriendAnimalList)
   {
    ja.put(s);
   }
   jo.put(jn_feedFriendAnimalList, ja);

   /* member */
   jo.put(jn_receivePoint, config.receivePoint);

  }catch(Exception e)
  {
   Log.printStackTrace(TAG, e);
  }
  return formatJson(jo);
 }

 private static String formatJson(JSONObject jo)
 {
  String formated = null;
  try
  {
   formated = jo.toString(4);
  }catch(Exception e)
  {
   return jo.toString();
  }
  StringBuilder sb = new StringBuilder(formated);
  char currentChar, lastNonSpaceChar = 0;
  for(int i = 0; i < sb.length(); i++)
  {
   currentChar = sb.charAt(i);
   switch(currentChar)
   {
    case '"':
     switch(lastNonSpaceChar)
     {
      case ':':
      case '[':
       sb.deleteCharAt(i);
       i = sb.indexOf("\"", i);
       sb.deleteCharAt(i);
       if(lastNonSpaceChar != '[') lastNonSpaceChar = sb.charAt(--i);
     }
     break;

    case ' ':
     break;

    default:
     if(lastNonSpaceChar == '[' && currentChar != ']')
      break;
     lastNonSpaceChar = currentChar;
   }
  }
  formated = sb.toString();
  return formated;
 }

 private static String removeOutcomment(String s)
 {
  StringBuilder sb = new StringBuilder(s);
  sbi:for(int i = 0; i < sb.length(); i++)
  {
   if(sb.charAt(i) == '\n')
   {
    int nextNL = sb.indexOf("\n", i + 1),
     outcoI = sb.indexOf("//", i + 1);
    if(i < outcoI && outcoI < nextNL)
    {
     sb.delete(i--, nextNL);
    }
   }
  }
  return sb.toString();
 }

}
