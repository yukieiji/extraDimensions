# extraDimensions
Extra Dimensions is possible to create dimensions that can be freely created by using commands.<br>
If you install this mod on server, no one has to install this!!(This mod can also work with server only)


Allows dynamic creation and deletion of dimensions via commands (restricted to ops in multiplayer).  Adds the following commands:
```
xdbiomes
  list all biomes supported by ExtraDimensions

xdcreate <Dimension Name> <World Type> <Biomes>
  create a new ExtraDimension
  	<Dimension Name> - required.  String with no spaces
	<World Type>     - optional.  World type for new dimension:
                                          xdMultiBiome - ExtraDimensions Default
                                          BOP          - Biomes O'Plenty (if installed)
                                          flat         - Minecraft flat world
                                          default      - Minecraft overworld
                                          largeBiomes  - Minecraft large biomes (as used on Minecraft servers)
                                          amplified    - Minecraft amplified
                                          default_1_1  - Minecraft
	<Biomes>         - optional.  Comma separated list of biome IDs without spaces

xddelete <Dimension Name or ID>
  delete existing ExtraDimension
     <Dimension Name or ID> - required.  Name or ID of dimension to delete

xdlist <Dimension name or ID or '.'>
  list dimension information
     <Dimension name or ID or '.'> - optional.  If included, list information for dimension name/ID.  "." will list current dimension

xdrename <Dimension Name or ID> <New Dimension Name>
  rename existing ExtraDimension
     <Dimension Name or ID> - required.  Name or ID of dimension to rename
     <New Dimension Name>   - required.  New name for dimension

xdtp <target player name> <destination player name>
-or-
xdtp <target player name> <destination dimension (name or ID)> <x> <y> <z>
  teleport to an ExtraDimensions
     <target player name>                 - optional.  Player to teleport.  If not specified will act on player who sent commands
     <destination player name>            - required.  Teleport to position of player, regarless of what dimensions
     <destination dimension (name or ID)> - required.  ExtraDimension to teleport to.  0 or overworld will go to overworld
     <x> <y> <z>                          - optional.  Position to teleport to
```


