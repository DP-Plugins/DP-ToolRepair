<center><img src="https://i.postimg.cc/MKPVVR1s/dplogo-512.png" alt="logo"></center>
<center><img src="https://i.postimg.cc/RZ9dqPFx/introduce.png" alt="introduce"></center>

Example Video : *Coming soon!*

This plugin lets players repair their tools through an in-game GUI, charging configurable costs in money and/or experience.  
Players can open the repair GUI, place damaged tools inside, and repair them all at once if they have enough money/EXP.  
Admins can reload config and language files without restarting.

---

<center><img src="https://i.postimg.cc/RZ9dqP08/description.png" alt="description"></center>

- **GUI-based tool repair** — Players open the repair inventory and place damaged tools to repair  
- **Money and EXP costs** — Repair cost is calculated per durability point and can charge money, EXP, or both  
- **Configurable rates** — Set cost per durability and toggle money/EXP costs in `config.yml`  
- **Safe item handling** — Items are returned when closing the GUI (or dropped if inventory is full)  
- **Simple admin management** — Supports reload command to apply settings instantly  

---

<center><img src="https://i.postimg.cc/rwcjzhpH/depend-plugin.png" alt="depend-plugin"></center>

- All DP-Plugins require the **`DPP-Core`** plugin.  
- The plugin will not work if **`DPP-Core`** is not installed.  
- You can download **`DPP-Core`** here: <a href="https://github.com/DP-Plugins/DPP-Core/releases" target="_blank">Click me!</a>  
- This plugin requires **Essentials** for economy support (money cost feature).  

---

<center><img src="https://i.postimg.cc/dV01RxJB/installation.png" alt="installation"></center>

1️⃣ Place the **`DPP-Core`** plugin, **Essentials**, and this plugin file (**`DP-ToolRepair-*.jar`**) into your server’s **`plugins`** folder.  

2️⃣ Restart the server, and the plugin will be automatically enabled.  

3️⃣ If needed, you can open and modify **`config.yml`** and **language files** to customize settings, then apply with `/dptr reload`.  

---

<center><img src="https://i.postimg.cc/jSKcC85K/settings.png" alt="settings"></center>

- **`config.yml`**: Manages basic plugin settings.  
  - `Settings.prefix`: plugin message prefix  
  - `Settings.EnableMoneyCost`: enable/disable money cost  
  - `Settings.EnableExpCost`: enable/disable exp cost  
  - `Settings.RepairMoneyCostPerDurability`: money cost per durability  
  - `Settings.RepairExpCostPerDurability`: exp cost per durability  

---

<center><img src="https://i.postimg.cc/SxqdjZKw/command.png" alt="command"></center>

❗ Some commands require admin permission (`dptr.admin`).  

**Command List and Examples**

| Command | Permission | Description | Example |
|---|---|---|---|
| `/dptr open` | dptr.use | Open the tool repair GUI | `/dptr open` |
| `/dptr reload` | dptr.admin | Reload config and language files | `/dptr reload` |

**❗Notes when using commands**

- Repair costs are calculated by durability and shown inside the GUI  
- If the player does not have enough money/EXP, the repair is cancelled  
- Money cost requires Essentials (economy)  
- Admin commands require **OP** status or the `dptr.admin` permission  

---

<center><img src="https://i.postimg.cc/Z5ZH0fqL/api-integration.png" alt="api-integration"></center>

- Economy transactions are handled via **DPP-Core MoneyAPI** (Essentials economy required for money cost)  

---

<center><a href="https://discord.gg/JnMCqkn2FX"><img src="https://i.postimg.cc/4xZPn8dC/discord.png" alt="discord"></a></center>

- https://discord.gg/JnMCqkn2FX  
- If you have any questions or issues, please contact your server administrator or refer to the plugin distribution page.  
- Feel free to leave suggestions for new features or improvements anytime!

---
